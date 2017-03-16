// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Context
import io.fabric8.kubernetes.api.model.NamedContext


fun  NamedContext.`context`(block: Context.() -> Unit = {}) {
  if(this.`context` == null) {
    this.`context` = Context()
  }

  this.`context`.block()
}

