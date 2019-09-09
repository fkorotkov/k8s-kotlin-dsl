// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Context as model_Context
import io.fabric8.kubernetes.api.model.NamedContext as model_NamedContext


fun  model_NamedContext.`context`(block: model_Context.() -> Unit = {}) {
  if(this.`context` == null) {
    this.`context` = model_Context()
  }

  this.`context`.block()
}

