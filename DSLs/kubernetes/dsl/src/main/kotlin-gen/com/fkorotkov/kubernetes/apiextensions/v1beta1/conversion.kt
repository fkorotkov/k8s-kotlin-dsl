// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceConversion as v1beta1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec


fun  v1beta1_CustomResourceDefinitionSpec.`conversion`(block: v1beta1_CustomResourceConversion.() -> Unit = {}) {
  if(this.`conversion` == null) {
    this.`conversion` = v1beta1_CustomResourceConversion()
  }

  this.`conversion`.block()
}

