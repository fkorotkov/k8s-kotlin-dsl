// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec as apiextensions_CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersion as apiextensions_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources as apiextensions_CustomResourceSubresources


fun  apiextensions_CustomResourceDefinitionSpec.`subresources`(block: apiextensions_CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = apiextensions_CustomResourceSubresources()
  }

  this.`subresources`.block()
}


fun  apiextensions_CustomResourceDefinitionVersion.`subresources`(block: apiextensions_CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = apiextensions_CustomResourceSubresources()
  }

  this.`subresources`.block()
}

