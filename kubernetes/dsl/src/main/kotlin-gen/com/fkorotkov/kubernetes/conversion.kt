// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec


fun  CustomResourceDefinitionSpec.`conversion`(block: CustomResourceConversion.() -> Unit = {}) {
  if(this.`conversion` == null) {
    this.`conversion` = CustomResourceConversion()
  }

  this.`conversion`.block()
}

