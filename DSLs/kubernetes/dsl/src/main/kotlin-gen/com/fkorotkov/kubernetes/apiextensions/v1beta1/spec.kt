// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinition as v1beta1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec


fun  v1beta1_CustomResourceDefinition.`spec`(block: v1beta1_CustomResourceDefinitionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_CustomResourceDefinitionSpec()
  }

  this.`spec`.block()
}

