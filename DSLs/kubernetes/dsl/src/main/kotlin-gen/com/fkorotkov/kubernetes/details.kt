// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.StatusDetails as model_StatusDetails


fun  model_Status.`details`(block: model_StatusDetails.() -> Unit = {}) {
  if(this.`details` == null) {
    this.`details` = model_StatusDetails()
  }

  this.`details`.block()
}

