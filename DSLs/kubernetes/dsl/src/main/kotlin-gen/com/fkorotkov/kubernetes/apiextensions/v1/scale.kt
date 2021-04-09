// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresourceScale as v1_CustomResourceSubresourceScale
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresources as v1_CustomResourceSubresources


fun  v1_CustomResourceSubresources.`scale`(block: v1_CustomResourceSubresourceScale.() -> Unit = {}) {
  if(this.`scale` == null) {
    this.`scale` = v1_CustomResourceSubresourceScale()
  }

  this.`scale`.block()
}

