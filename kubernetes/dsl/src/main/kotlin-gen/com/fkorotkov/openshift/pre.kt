// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook as model_LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams as model_RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams


fun  model_RecreateDeploymentStrategyParams.`pre`(block: model_LifecycleHook.() -> Unit = {}) {
  if(this.`pre` == null) {
    this.`pre` = model_LifecycleHook()
  }

  this.`pre`.block()
}


fun  model_RollingDeploymentStrategyParams.`pre`(block: model_LifecycleHook.() -> Unit = {}) {
  if(this.`pre` == null) {
    this.`pre` = model_LifecycleHook()
  }

  this.`pre`.block()
}

