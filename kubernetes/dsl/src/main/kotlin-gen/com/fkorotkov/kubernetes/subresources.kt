// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources


fun  CustomResourceDefinitionSpec.`subresources`(block: CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = CustomResourceSubresources()
  }

  this.`subresources`.block()
}


fun  CustomResourceDefinitionVersion.`subresources`(block: CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = CustomResourceSubresources()
  }

  this.`subresources`.block()
}

