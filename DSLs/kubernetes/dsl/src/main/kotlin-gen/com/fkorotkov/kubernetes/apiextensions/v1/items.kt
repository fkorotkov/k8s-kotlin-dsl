// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrArray as v1_JSONSchemaPropsOrArray


fun  v1_JSONSchemaProps.`items`(block: v1_JSONSchemaPropsOrArray.() -> Unit = {}) {
  if(this.`items` == null) {
    this.`items` = v1_JSONSchemaPropsOrArray()
  }

  this.`items`.block()
}

