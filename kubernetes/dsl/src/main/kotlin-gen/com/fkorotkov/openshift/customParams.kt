// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams
import io.fabric8.openshift.api.model.DeploymentStrategy


fun  DeploymentStrategy.`customParams`(block: CustomDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`customParams` == null) {
    this.`customParams` = CustomDeploymentStrategyParams()
  }

  this.`customParams`.block()
}

