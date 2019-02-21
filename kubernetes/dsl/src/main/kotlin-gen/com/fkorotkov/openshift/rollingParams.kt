// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams


fun  model_DeploymentStrategy.`rollingParams`(block: model_RollingDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`rollingParams` == null) {
    this.`rollingParams` = model_RollingDeploymentStrategyParams()
  }

  this.`rollingParams`.block()
}

