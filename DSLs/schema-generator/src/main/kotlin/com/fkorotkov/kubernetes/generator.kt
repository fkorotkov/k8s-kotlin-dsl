package com.fkorotkov.kubernetes

import com.fkorotkov.kotlin.dsl.crd.CRDDefinition
import com.fkorotkov.kotlin.dsl.crd.OpenAPIV3Schema
import com.google.gson.GsonBuilder
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory
import java.io.File
import java.util.*

fun main(args: Array<String>) {
  val schemeName = args[0]
  val outputFile = File(args[1])

  if (outputFile.exists()) {
    outputFile.deleteRecursively()
  }

  val crd = CRDDefinition.parseFromResource("${schemeName}clusters-crd.json")
  val createSchema = createSchema(crd, schemeName)

  val gson = GsonBuilder()
      .registerTypeAdapterFactory(
          RuntimeTypeAdapterFactory.of(PropertyDefinition::class.java)
              .registerSubtype(PrimitiveStringPropertyDefinition::class.java, "string")
              .registerSubtype(PrimitiveIntegerPropertyDefinition::class.java, "integer")
              .registerSubtype(PrimitiveBooleanPropertyDefinition::class.java, "boolean")
              .registerSubtype(ArrayPropertyDefinition::class.java, "array")
              .registerSubtype(RefPropertyDefinition::class.java, "ref")
              .registerSubtype(ExistingTypePropertyDefinition::class.java, "object")
      )
      .setPrettyPrinting()
      .create()
  outputFile.writeText(gson.toJson(createSchema))
}

fun createSchema(crd: CRDDefinition, schemeName: String): Schema {
  val result = Schema()
  val typeDefinitionRegistry = mutableMapOf<String, TypeDefinition>()
  generateTypes(typeDefinitionRegistry, "com.fkorotkov.kubernetes.$schemeName", crd.spec.names.kind, crd.spec.validation.openAPIV3Schema)

  typeDefinitionRegistry.remove("Metadata")
  typeDefinitionRegistry.forEach { _, definition ->
    if (definition.properties.containsKey("metadata")) {
      definition.javaInterfaces = definition.javaInterfaces + "io.fabric8.kubernetes.api.model.HasMetadata"
      definition.properties = definition.properties + mapOf(
          "metadata" to ExistingTypePropertyDefinition().apply {
            existingJavaType = "io.fabric8.kubernetes.api.model.ObjectMeta"
          }
      )
    }
  }

  typeDefinitionRegistry["${crd.spec.names.kind}List"] = TypeDefinition().apply {
    javaType = "com.fkorotkov.kubernetes.$schemeName.${crd.spec.names.kind}List"
    javaInterfaces = listOf(
        "io.fabric8.kubernetes.api.model.KubernetesResource",
        "io.fabric8.kubernetes.api.model.KubernetesResourceList"
    )
    properties = TreeMap(mapOf(
        "apiVersion" to PrimitiveStringPropertyDefinition().apply { default = "${crd.spec.group}/${crd.spec.version}" },
        "kind" to PrimitiveStringPropertyDefinition().apply { default = "${crd.spec.names.kind}List" },
        "items" to ArrayPropertyDefinition().apply {
          items = RefPropertyDefinition().apply {
            ref = "#/definitions/${crd.spec.names.kind}"
            javaType = "com.fkorotkov.kubernetes.$schemeName.${crd.spec.names.kind}"
          }
        },
        "metadata" to ExistingTypePropertyDefinition().apply {
          existingJavaType = "io.fabric8.kubernetes.api.model.ListMeta"
        }
    ))
  }

  (typeDefinitionRegistry[crd.spec.names.kind]?.properties?.get("apiVersion") as? PrimitiveStringPropertyDefinition)?.default = "${crd.spec.group}/${crd.spec.version}"
  (typeDefinitionRegistry[crd.spec.names.kind]?.properties?.get("kind") as? PrimitiveStringPropertyDefinition)?.default = crd.spec.names.kind

  result.definitions = TreeMap(typeDefinitionRegistry)
  result.properties = TreeMap(typeDefinitionRegistry.map { (name, definition) ->
    name.decapitalize() to RefPropertyDefinition().apply {
      ref = "#/definitions/$name"
      javaType = "com.fkorotkov.kubernetes.$schemeName.$name"
    }
  }.toMap())
  return result
}

fun generateTypes(registry: MutableMap<String, TypeDefinition>, packagePrefix: String, name: String, schema: OpenAPIV3Schema) {
  val fqn = "$packagePrefix.$name"
  val typeRef = name
  if (schema.type != "object") {
    return
  }
  if (registry.containsKey(typeRef)) {
    return
  }
  val result = TypeDefinition().apply {
    javaType = fqn
  }

  // object is always KubernetesResource
  result.javaInterfaces = listOf("io.fabric8.kubernetes.api.model.KubernetesResource")
  result.properties = schema.properties.mapValues { (name, openAPISchema) ->
    val typeName = name.capitalize()
    when (openAPISchema.type) {
      "object" -> {
        generateTypes(registry, packagePrefix, typeName, openAPISchema)
        RefPropertyDefinition().apply {
          ref = "#/definitions/$typeName"
          javaType = "$packagePrefix.$typeName"
        }
      }
      "array" -> {
        generateTypes(registry, packagePrefix, typeName.removeSuffix("s"), openAPISchema.items
            ?: throw IllegalStateException("Array for $typeName should have items!!"))

        ArrayPropertyDefinition().apply {
          items = when (openAPISchema.items?.type) {
            "string" -> PrimitiveStringPropertyDefinition()
            "boolean" -> PrimitiveBooleanPropertyDefinition()
            "integer" -> PrimitiveIntegerPropertyDefinition()
            else -> RefPropertyDefinition().apply {
              ref = "#/definitions/${typeName.removeSuffix("s")}"
              javaType = "$packagePrefix.${typeName.removeSuffix("s")}"
            }
          }
        }
      }
      "string" -> PrimitiveStringPropertyDefinition()
      "boolean" -> PrimitiveBooleanPropertyDefinition()
      "integer" -> PrimitiveIntegerPropertyDefinition()
      else -> throw IllegalStateException()
    }
  }

  registry[typeRef] = result
}
