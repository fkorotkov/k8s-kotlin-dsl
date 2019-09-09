// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition as apiextensions_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec as apiextensions_CustomResourceDefinitionSpec


fun  apiextensions_CustomResourceDefinition.`spec`(block: apiextensions_CustomResourceDefinitionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = apiextensions_CustomResourceDefinitionSpec()
  }

  this.`spec`.block()
}

