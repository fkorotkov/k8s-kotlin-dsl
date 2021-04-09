// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionNames as v1_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionSpec as v1_CustomResourceDefinitionSpec


fun  v1_CustomResourceDefinitionSpec.`names`(block: v1_CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = v1_CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

