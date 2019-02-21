// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps


fun  apiextensions_JSONSchemaProps.`not`(block: apiextensions_JSONSchemaProps.() -> Unit = {}) {
  if(this.`not` == null) {
    this.`not` = apiextensions_JSONSchemaProps()
  }

  this.`not`.block()
}

