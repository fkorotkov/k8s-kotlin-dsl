// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec as apiextensions_CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation as apiextensions_CustomResourceValidation


fun  apiextensions_CustomResourceDefinitionSpec.`validation`(block: apiextensions_CustomResourceValidation.() -> Unit = {}) {
  if(this.`validation` == null) {
    this.`validation` = apiextensions_CustomResourceValidation()
  }

  this.`validation`.block()
}

