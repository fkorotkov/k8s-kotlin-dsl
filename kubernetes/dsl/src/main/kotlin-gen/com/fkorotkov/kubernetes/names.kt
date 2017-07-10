// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec


fun  CustomResourceDefinitionSpec.`names`(block: CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

