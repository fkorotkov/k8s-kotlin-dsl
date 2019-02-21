// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames as apiextensions_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec as apiextensions_CustomResourceDefinitionSpec


fun  apiextensions_CustomResourceDefinitionSpec.`names`(block: apiextensions_CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = apiextensions_CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

