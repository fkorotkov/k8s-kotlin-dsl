// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition as v1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionSpec as v1_CustomResourceDefinitionSpec


fun  v1_CustomResourceDefinition.`spec`(block: v1_CustomResourceDefinitionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_CustomResourceDefinitionSpec()
  }

  this.`spec`.block()
}

