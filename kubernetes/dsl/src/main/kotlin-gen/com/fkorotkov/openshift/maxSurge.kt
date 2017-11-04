// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams


fun  RollingDeploymentStrategyParams.`maxSurge`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = IntOrString()
  }

  this.`maxSurge`.block()
}

