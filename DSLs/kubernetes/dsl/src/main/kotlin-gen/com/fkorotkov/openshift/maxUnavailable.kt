// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams


fun  model_RollingDeploymentStrategyParams.`maxUnavailable`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = model_IntOrString()
  }

  this.`maxUnavailable`.block()
}

