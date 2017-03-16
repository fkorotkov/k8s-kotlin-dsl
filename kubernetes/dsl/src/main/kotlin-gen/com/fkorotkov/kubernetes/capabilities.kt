// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Capabilities
import io.fabric8.kubernetes.api.model.SecurityContext


fun  SecurityContext.`capabilities`(block: Capabilities.() -> Unit = {}) {
  if(this.`capabilities` == null) {
    this.`capabilities` = Capabilities()
  }

  this.`capabilities`.block()
}

