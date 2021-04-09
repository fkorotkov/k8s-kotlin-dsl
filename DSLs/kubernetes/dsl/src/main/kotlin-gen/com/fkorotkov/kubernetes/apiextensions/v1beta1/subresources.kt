// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionVersion as v1beta1_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceSubresources as v1beta1_CustomResourceSubresources


fun  v1beta1_CustomResourceDefinitionSpec.`subresources`(block: v1beta1_CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = v1beta1_CustomResourceSubresources()
  }

  this.`subresources`.block()
}


fun  v1beta1_CustomResourceDefinitionVersion.`subresources`(block: v1beta1_CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = v1beta1_CustomResourceSubresources()
  }

  this.`subresources`.block()
}

