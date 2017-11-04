// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Initializers
import io.fabric8.kubernetes.api.model.Status


fun  Initializers.`result`(block: Status.() -> Unit = {}) {
  if(this.`result` == null) {
    this.`result` = Status()
  }

  this.`result`.block()
}

