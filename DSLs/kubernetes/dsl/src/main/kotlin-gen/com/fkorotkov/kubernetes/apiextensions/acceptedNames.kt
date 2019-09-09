// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames as apiextensions_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus as apiextensions_CustomResourceDefinitionStatus


fun  apiextensions_CustomResourceDefinitionStatus.`acceptedNames`(block: apiextensions_CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`acceptedNames` == null) {
    this.`acceptedNames` = apiextensions_CustomResourceDefinitionNames()
  }

  this.`acceptedNames`.block()
}

