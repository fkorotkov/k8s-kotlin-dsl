// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceValidation as v1beta1_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaProps as v1beta1_JSONSchemaProps


fun  v1beta1_CustomResourceValidation.`openAPIV3Schema`(block: v1beta1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`openAPIV3Schema` == null) {
    this.`openAPIV3Schema` = v1beta1_JSONSchemaProps()
  }

  this.`openAPIV3Schema`.block()
}

