// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray


fun  JSONSchemaPropsOrArray.`schema`(block: JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  JSONSchemaPropsOrBool.`schema`(block: JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  JSONSchemaPropsOrStringArray.`schema`(block: JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = JSONSchemaProps()
  }

  this.`schema`.block()
}

