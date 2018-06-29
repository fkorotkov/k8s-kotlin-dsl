// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation


fun  CustomResourceDefinitionSpec.`validation`(block: CustomResourceValidation.() -> Unit = {}) {
  if(this.`validation` == null) {
    this.`validation` = CustomResourceValidation()
  }

  this.`validation`.block()
}

