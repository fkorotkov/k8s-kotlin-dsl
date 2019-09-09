// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentStrategy as model_DeploymentStrategy
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams as model_RecreateDeploymentStrategyParams


fun  model_DeploymentStrategy.`recreateParams`(block: model_RecreateDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`recreateParams` == null) {
    this.`recreateParams` = model_RecreateDeploymentStrategyParams()
  }

  this.`recreateParams`.block()
}

