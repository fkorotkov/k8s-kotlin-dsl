package com.fkorotkov.kubernetes.kafka

import com.google.gson.annotations.SerializedName

class Schema {
  var id = "http://fabric8.io/fabric8/v2/Schema#"

  @SerializedName("\$schema")
  var schema = "http://json-schema.org/schema#"

  var type = "object"

  var definitions: Map<String, TypeDefinition> = emptyMap()

  var properties: Map<String, PropertyDefinition> = emptyMap()
}

class TypeDefinition {
  var type = "object"

  var description = ""

  var additionalProperties = true

  var javaType = ""

  var javaInterfaces = emptyList<String>()

  var properties = emptyMap<String, PropertyDefinition>()
}

sealed class PropertyDefinition

class PrimitiveStringPropertyDefinition : PropertyDefinition() {
  var description: String = ""
  var default: String? = null
  var required: Boolean = false
}

class PrimitiveBooleanPropertyDefinition : PropertyDefinition() {
  var description: String = ""
  var default: String? = null
  var required: Boolean = false
}

class PrimitiveIntegerPropertyDefinition : PropertyDefinition() {
  var description: String = ""
  var default: String? = null
  var required: Boolean = false
}

class ArrayPropertyDefinition : PropertyDefinition() {
  var description: String = ""
  var required: Boolean = false
  var items: PropertyDefinition? = null
}

class RefPropertyDefinition : PropertyDefinition() {
  @SerializedName("\$ref")
  var ref: String = ""
  var javaType: String = ""
}