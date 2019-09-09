// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Initializers as model_Initializers
import io.fabric8.kubernetes.api.model.Status as model_Status


fun  model_Initializers.`result`(block: model_Status.() -> Unit = {}) {
  if(this.`result` == null) {
    this.`result` = model_Status()
  }

  this.`result`.block()
}

