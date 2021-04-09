// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceSubresourceScale as v1beta1_CustomResourceSubresourceScale
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceSubresources as v1beta1_CustomResourceSubresources


fun  v1beta1_CustomResourceSubresources.`scale`(block: v1beta1_CustomResourceSubresourceScale.() -> Unit = {}) {
  if(this.`scale` == null) {
    this.`scale` = v1beta1_CustomResourceSubresourceScale()
  }

  this.`scale`.block()
}

