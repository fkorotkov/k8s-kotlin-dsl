// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray as apiextensions_JSONSchemaPropsOrArray


fun  apiextensions_JSONSchemaProps.`items`(block: apiextensions_JSONSchemaPropsOrArray.() -> Unit = {}) {
  if(this.`items` == null) {
    this.`items` = apiextensions_JSONSchemaPropsOrArray()
  }

  this.`items`.block()
}

