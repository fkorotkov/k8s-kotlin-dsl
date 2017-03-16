// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment


fun  DeploymentStrategy.`rollingUpdate`(block: RollingUpdateDeployment.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = RollingUpdateDeployment()
  }

  this.`rollingUpdate`.block()
}

