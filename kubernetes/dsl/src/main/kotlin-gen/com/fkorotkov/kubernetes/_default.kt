// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.JSON
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps


fun  JSONSchemaProps.`_default`(block: JSON.() -> Unit = {}) {
  if(this.`default` == null) {
    this.`default` = JSON()
  }

  this.`default`.block()
}

