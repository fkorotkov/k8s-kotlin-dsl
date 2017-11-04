// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentStrategy
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams


fun  DeploymentStrategy.`recreateParams`(block: RecreateDeploymentStrategyParams.() -> Unit = {}) {
  if(this.`recreateParams` == null) {
    this.`recreateParams` = RecreateDeploymentStrategyParams()
  }

  this.`recreateParams`.block()
}

