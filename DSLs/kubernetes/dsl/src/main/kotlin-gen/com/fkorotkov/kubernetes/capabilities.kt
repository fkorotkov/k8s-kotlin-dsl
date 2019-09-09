// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Capabilities as model_Capabilities
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext


fun  model_SecurityContext.`capabilities`(block: model_Capabilities.() -> Unit = {}) {
  if(this.`capabilities` == null) {
    this.`capabilities` = model_Capabilities()
  }

  this.`capabilities`.block()
}

