// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Lifecycle


fun  Lifecycle.`postStart`(block: Handler.() -> Unit = {}) {
  if(this.`postStart` == null) {
    this.`postStart` = Handler()
  }

  this.`postStart`.block()
}

