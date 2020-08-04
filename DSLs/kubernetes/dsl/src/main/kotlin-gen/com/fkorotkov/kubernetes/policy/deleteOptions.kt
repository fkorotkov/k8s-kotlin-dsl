// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.policy.Eviction as policy_Eviction


fun  policy_Eviction.`deleteOptions`(block: model_DeleteOptions.() -> Unit = {}) {
  if(this.`deleteOptions` == null) {
    this.`deleteOptions` = model_DeleteOptions()
  }

  this.`deleteOptions`.block()
}

