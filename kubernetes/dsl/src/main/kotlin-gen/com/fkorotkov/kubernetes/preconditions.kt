// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DeleteOptions
import io.fabric8.kubernetes.api.model.Preconditions


fun  DeleteOptions.`preconditions`(block: Preconditions.() -> Unit = {}) {
  if(this.`preconditions` == null) {
    this.`preconditions` = Preconditions()
  }

  this.`preconditions`.block()
}

