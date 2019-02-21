// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresourceScale as apiextensions_CustomResourceSubresourceScale
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceSubresources as apiextensions_CustomResourceSubresources


fun  apiextensions_CustomResourceSubresources.`scale`(block: apiextensions_CustomResourceSubresourceScale.() -> Unit = {}) {
  if(this.`scale` == null) {
    this.`scale` = apiextensions_CustomResourceSubresourceScale()
  }

  this.`scale`.block()
}

