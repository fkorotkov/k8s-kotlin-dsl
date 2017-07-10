// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus


fun  CustomResourceDefinitionStatus.`acceptedNames`(block: CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`acceptedNames` == null) {
    this.`acceptedNames` = CustomResourceDefinitionNames()
  }

  this.`acceptedNames`.block()
}

