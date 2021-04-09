// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionVersion as v1_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresources as v1_CustomResourceSubresources


fun  v1_CustomResourceDefinitionVersion.`subresources`(block: v1_CustomResourceSubresources.() -> Unit = {}) {
  if(this.`subresources` == null) {
    this.`subresources` = v1_CustomResourceSubresources()
  }

  this.`subresources`.block()
}

