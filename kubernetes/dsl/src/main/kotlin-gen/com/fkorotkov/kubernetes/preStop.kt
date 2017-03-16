// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Handler
import io.fabric8.kubernetes.api.model.Lifecycle


fun  Lifecycle.`preStop`(block: Handler.() -> Unit = {}) {
  if(this.`preStop` == null) {
    this.`preStop` = Handler()
  }

  this.`preStop`.block()
}

