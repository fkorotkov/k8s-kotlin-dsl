// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps


fun  JSONSchemaProps.`not`(block: JSONSchemaProps.() -> Unit = {}) {
  if(this.`not` == null) {
    this.`not` = JSONSchemaProps()
  }

  this.`not`.block()
}

