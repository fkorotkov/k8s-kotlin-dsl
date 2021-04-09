// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceConversion as v1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionSpec as v1_CustomResourceDefinitionSpec


fun  v1_CustomResourceDefinitionSpec.`conversion`(block: v1_CustomResourceConversion.() -> Unit = {}) {
  if(this.`conversion` == null) {
    this.`conversion` = v1_CustomResourceConversion()
  }

  this.`conversion`.block()
}

