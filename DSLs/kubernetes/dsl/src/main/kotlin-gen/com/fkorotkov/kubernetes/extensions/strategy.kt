// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy as extensions_DeploymentStrategy


fun  extensions_DeploymentSpec.`strategy`(block: extensions_DeploymentStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = extensions_DeploymentStrategy()
  }

  this.`strategy`.block()
}

