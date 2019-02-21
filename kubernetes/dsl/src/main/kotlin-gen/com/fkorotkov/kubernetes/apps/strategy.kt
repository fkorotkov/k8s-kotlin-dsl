// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy as apps_DeploymentStrategy


fun  apps_DeploymentSpec.`strategy`(block: apps_DeploymentStrategy.() -> Unit = {}) {
  if(this.`strategy` == null) {
    this.`strategy` = apps_DeploymentStrategy()
  }

  this.`strategy`.block()
}

