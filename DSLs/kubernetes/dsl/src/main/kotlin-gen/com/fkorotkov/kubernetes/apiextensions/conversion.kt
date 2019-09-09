// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceConversion as apiextensions_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec as apiextensions_CustomResourceDefinitionSpec


fun  apiextensions_CustomResourceDefinitionSpec.`conversion`(block: apiextensions_CustomResourceConversion.() -> Unit = {}) {
  if(this.`conversion` == null) {
    this.`conversion` = apiextensions_CustomResourceConversion()
  }

  this.`conversion`.block()
}

