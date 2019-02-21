// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams as model_CustomDeploymentStrategyParams
import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy


fun  model_DeploymentStrategy.`customParams`(block: model_CustomDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`customParams` == null) {
    this.`customParams` = model_CustomDeploymentStrategyParams()
  }

  this.`customParams`.block()
}

