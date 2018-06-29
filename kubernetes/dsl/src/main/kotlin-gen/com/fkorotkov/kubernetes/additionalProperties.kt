// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool


fun  JSONSchemaProps.`additionalProperties`(block: JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalProperties` == null) {
    this.`additionalProperties` = JSONSchemaPropsOrBool()
  }

  this.`additionalProperties`.block()
}

