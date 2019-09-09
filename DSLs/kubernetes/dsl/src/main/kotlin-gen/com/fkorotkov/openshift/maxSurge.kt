// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams


fun  model_RollingDeploymentStrategyParams.`maxSurge`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = model_IntOrString()
  }

  this.`maxSurge`.block()
}

