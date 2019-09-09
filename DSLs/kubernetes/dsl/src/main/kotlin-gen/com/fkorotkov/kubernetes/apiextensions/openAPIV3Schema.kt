// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation as apiextensions_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps


fun  apiextensions_CustomResourceValidation.`openAPIV3Schema`(block: apiextensions_JSONSchemaProps.() -> Unit = {}) {
  if(this.`openAPIV3Schema` == null) {
    this.`openAPIV3Schema` = apiextensions_JSONSchemaProps()
  }

  this.`openAPIV3Schema`.block()
}

