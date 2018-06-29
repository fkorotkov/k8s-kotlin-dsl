// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apps.DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy


fun  DeploymentSpec.`strategy`(block: DeploymentStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = DeploymentStrategy()
  }

  this.`strategy`.block()
}

