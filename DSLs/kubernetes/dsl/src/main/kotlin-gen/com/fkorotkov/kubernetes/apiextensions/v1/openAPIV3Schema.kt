// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceValidation as v1_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps


fun  v1_CustomResourceValidation.`openAPIV3Schema`(block: v1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`openAPIV3Schema` == null) {
    this.`openAPIV3Schema` = v1_JSONSchemaProps()
  }

  this.`openAPIV3Schema`.block()
}

