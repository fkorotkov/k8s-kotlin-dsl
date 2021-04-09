// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionNames as v1beta1_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec


fun  v1beta1_CustomResourceDefinitionSpec.`names`(block: v1beta1_CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = v1beta1_CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

