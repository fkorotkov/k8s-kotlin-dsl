// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.JSON as apiextensions_JSON
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps


fun  apiextensions_JSONSchemaProps.`_default`(block: apiextensions_JSON.() -> Unit = {}) {
  if(this.`default` == null) {
    this.`default` = apiextensions_JSON()
  }

  this.`default`.block()
}

