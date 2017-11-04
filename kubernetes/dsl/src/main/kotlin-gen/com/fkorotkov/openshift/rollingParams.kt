// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentStrategy
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams


fun  DeploymentStrategy.`rollingParams`(block: RollingDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`rollingParams` == null) {
    this.`rollingParams` = RollingDeploymentStrategyParams()
  }

  this.`rollingParams`.block()
}

