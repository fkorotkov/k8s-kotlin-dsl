// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScale
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources


fun  CustomResourceSubresources.`scale`(block: CustomResourceSubresourceScale.() -> Unit = {}) {
  if(this.`scale` == null) {
    this.`scale` = CustomResourceSubresourceScale()
  }

  this.`scale`.block()
}

