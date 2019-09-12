package com.fkorotkov.kotlin.dsl.crd

import com.google.common.io.Resources
import com.google.gson.Gson
import java.nio.charset.Charset

class CRDDefinition {
  companion object {
    fun parseFromResource(name: String): CRDDefinition {
      val url = Resources.getResource(name)
      val content = Resources.toString(url, Charset.defaultCharset())
      return parse(content)
    }

    fun parse(data: String): CRDDefinition {
      return Gson().fromJson(data, CRDDefinition::class.java)
    }
  }

  lateinit var apiVersion: String
  lateinit var spec: CRDDefinitionSpec
}

class CRDDefinitionSpec {
  lateinit var group: String
  lateinit var names: CRDDefinitionNames
  lateinit var validation: CRDDefinitionValidation
}

class CRDDefinitionNames {
  lateinit var kind: String
  lateinit var listKind: String
  lateinit var plural: String
  lateinit var singular: String
}

class CRDDefinitionValidation {
  lateinit var openAPIV3Schema: OpenAPIV3Schema
}

class OpenAPIV3Schema {
  var type: String = "object"
  var required: List<String> = emptyList()
  var properties: Map<String, OpenAPIV3Schema> = emptyMap()
  var items: OpenAPIV3Schema? = null
}