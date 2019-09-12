package com.fkorotkov.kotlin.dsl

import com.fkorotkov.kotlin.dsl.crd.CRDDefinition
import com.fkorotkov.kotlin.dsl.crd.OpenAPIV3Schema
import java.io.File

object CRDGenerator {
  fun generate(
      crd: CRDDefinition,
      outputRoot: File,
      outputPackage: String
  ) {
    val outputPackageFolder = File(outputRoot, outputPackage.replace('.', File.separatorChar))
    outputPackageFolder.mkdirs()
    generateClass(
        outputPackageFolder,
        outputPackage,
        crd.spec.names.kind,
        crd.spec.validation.openAPIV3Schema
    )
  }

  private fun generateClass(
      outputFolder: File,
      outputPackage: String,
      name: String,
      schema: OpenAPIV3Schema
  ): Pair<String, String>{
    return when (schema.type) {
      "boolean" -> "Boolean" to "false"
      "string" -> "String" to "\"\""
      "integer" -> "Int" to "0"
      "object" -> {
        if (schema.properties.isEmpty()) {
          "Map<String, Any>" to "emptyMap()"
        } else {
          File(outputFolder, "$name.kt")
              .also { it.createNewFile() }
              .writeText(generateClassTemplate(outputFolder, outputPackage, name, schema))
          name to "$name()"
        }
      }
      "array" -> {
        val (itemsClassName, _) = generateClass(
            outputFolder,
            outputPackage,
            name.removeSuffix("s"),
            schema.items ?: throw IllegalStateException("Array for $name should have items!!")
        )
        "List<$itemsClassName>" to "emptyList()"
      }
      else -> throw IllegalStateException("Type ${schema.type} for $name is not supported!")
    }
  }

  private fun generateClassTemplate(outputFolder: File, outputPackage: String, name: String, schema: OpenAPIV3Schema): String {
    return """
package $outputPackage

class $name {
  ${
    schema.properties.map { (fieldName, fieldSchema) -> 
      val (className, classDefaultValue) = generateClass(outputFolder, outputPackage, fieldName.capitalize(), fieldSchema)
      val optionalMark = if (schema.required.contains(fieldName)) "" else "?"
      val defaultValue = if (schema.required.contains(fieldName)) classDefaultValue else "null"
      "var $fieldName: $className$optionalMark = $defaultValue" 
    }.joinToString(separator = "\n  ")}
}
    """.trimIndent()
  }
}