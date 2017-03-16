// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.Lifecycle


fun  Container.`lifecycle`(block: Lifecycle.() -> Unit = {}) {
  if(this.`lifecycle` == null) {
    this.`lifecycle` = Lifecycle()
  }

  this.`lifecycle`.block()
}

