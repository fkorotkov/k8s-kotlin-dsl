// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams


fun  RollingDeploymentStrategyParams.`maxUnavailable`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = IntOrString()
  }

  this.`maxUnavailable`.block()
}

