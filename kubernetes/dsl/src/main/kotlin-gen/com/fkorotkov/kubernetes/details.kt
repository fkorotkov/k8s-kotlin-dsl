// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Status
import io.fabric8.kubernetes.api.model.StatusDetails


fun  Status.`details`(block: StatusDetails.() -> Unit = {}) {
  if(this.`details` == null) {
    this.`details` = StatusDetails()
  }

  this.`details`.block()
}

