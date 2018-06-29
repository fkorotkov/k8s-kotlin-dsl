// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps


fun  CustomResourceValidation.`openAPIV3Schema`(block: JSONSchemaProps.() -> Unit = {}) {
  if(this.`openAPIV3Schema` == null) {
    this.`openAPIV3Schema` = JSONSchemaProps()
  }

  this.`openAPIV3Schema`.block()
}

