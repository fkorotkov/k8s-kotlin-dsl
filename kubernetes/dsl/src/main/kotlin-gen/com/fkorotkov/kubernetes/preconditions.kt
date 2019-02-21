// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.Preconditions as model_Preconditions


fun  model_DeleteOptions.`preconditions`(block: model_Preconditions.() -> Unit = {}) {
  if(this.`preconditions` == null) {
    this.`preconditions` = model_Preconditions()
  }

  this.`preconditions`.block()
}

