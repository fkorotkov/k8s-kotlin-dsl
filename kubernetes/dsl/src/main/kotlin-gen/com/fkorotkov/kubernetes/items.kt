// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray


fun  JSONSchemaProps.`items`(block: JSONSchemaPropsOrArray.() -> Unit = {}) {
  if(this.`items` == null) {
    this.`items` = JSONSchemaPropsOrArray()
  }

  this.`items`.block()
}

