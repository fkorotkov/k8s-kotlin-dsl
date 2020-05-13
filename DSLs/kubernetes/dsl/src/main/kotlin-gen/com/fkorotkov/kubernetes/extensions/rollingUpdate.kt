// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy as extensions_DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy as extensions_DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment


fun  extensions_DaemonSetUpdateStrategy.`rollingUpdate`(block: extensions_RollingUpdateDaemonSet.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = extensions_RollingUpdateDaemonSet()
  }

  this.`rollingUpdate`.block()
}


fun  extensions_DeploymentStrategy.`rollingUpdate`(block: extensions_RollingUpdateDeployment.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = extensions_RollingUpdateDeployment()
  }

  this.`rollingUpdate`.block()
}

