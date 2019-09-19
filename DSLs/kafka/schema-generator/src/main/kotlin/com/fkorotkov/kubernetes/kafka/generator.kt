package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kotlin.dsl.crd.CRDDefinition
import com.fkorotkov.kotlin.dsl.crd.OpenAPIV3Schema
import com.google.gson.GsonBuilder
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory
import java.io.File
import java.util.*

fun main(args: Array<String>) {
  val outputFile = File(args[0])

  if (outputFile.exists()) {
    outputFile.deleteRecursively()
  }

  val kafkaCRD = CRDDefinition.parseFromResource("kafkaclusters-crd.json")
  val createSchema = createSchema(kafkaCRD)

  val gson = GsonBuilder()
      .registerTypeAdapterFactory(
          RuntimeTypeAdapterFactory.of(PropertyDefinition::class.java)
              .registerSubtype(PrimitiveStringPropertyDefinition::class.java, "string")
              .registerSubtype(PrimitiveIntegerPropertyDefinition::class.java, "integer")
              .registerSubtype(PrimitiveBooleanPropertyDefinition::class.java, "boolean")
              .registerSubtype(ArrayPropertyDefinition::class.java, "array")
              .registerSubtype(RefPropertyDefinition::class.java, "ref")
      )
      .setPrettyPrinting()
      .create()
  outputFile.writeText(gson.toJson(createSchema))
}

fun createSchema(kafkaCRD: CRDDefinition): Schema {
  val result = Schema()
  val typeDefinitionRegistry = mutableMapOf<String, TypeDefinition>()
  generateTypes(typeDefinitionRegistry, "com.fkorotkov.kubernetes.kafka", kafkaCRD.spec.names.kind, kafkaCRD.spec.validation.openAPIV3Schema)
  result.definitions = TreeMap(typeDefinitionRegistry)
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
          items = ArrayPropertyDefinitionItems().apply {
            ref = "#/definitions/${typeName.removeSuffix("s")}"
            javaType = "$packagePrefix.${typeName.removeSuffix("s")}"
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
