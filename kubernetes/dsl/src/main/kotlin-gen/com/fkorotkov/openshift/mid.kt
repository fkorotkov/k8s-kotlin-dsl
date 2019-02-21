// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook as model_LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams as model_RecreateDeploymentStrategyParams


fun  model_RecreateDeploymentStrategyParams.`mid`(block: model_LifecycleHook.() -> Unit = {}) {
  if(this.`mid` == null) {
    this.`mid` = model_LifecycleHook()
  }

  this.`mid`.block()
}

