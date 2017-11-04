// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Initializers
import io.fabric8.kubernetes.api.model.ObjectMeta


fun  ObjectMeta.`initializers`(block: Initializers.() -> Unit = {}) {
  if(this.`initializers` == null) {
    this.`initializers` = Initializers()
  }

  this.`initializers`.block()
}

