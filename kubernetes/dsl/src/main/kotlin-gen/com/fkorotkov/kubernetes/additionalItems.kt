// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool


fun  JSONSchemaProps.`additionalItems`(block: JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalItems` == null) {
    this.`additionalItems` = JSONSchemaPropsOrBool()
  }

  this.`additionalItems`.block()
}

