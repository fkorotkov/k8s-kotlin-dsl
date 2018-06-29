// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSON
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps


fun  JSONSchemaProps.`example`(block: JSON.() -> Unit = {}) {
  if(this.`example` == null) {
    this.`example` = JSON()
  }

  this.`example`.block()
}

