// GENERATED
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.policy.v1.Eviction as v1_Eviction


fun  v1_Eviction.`deleteOptions`(block: model_DeleteOptions.() -> Unit = {}) {
  if(this.`deleteOptions` == null) {
    this.`deleteOptions` = model_DeleteOptions()
  }

  this.`deleteOptions`.block()
}

