// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook as model_LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams as model_RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams as model_RollingDeploymentStrategyParams


fun  model_RecreateDeploymentStrategyParams.`post`(block: model_LifecycleHook.() -> Unit = {}) {
  if(this.`post` == null) {
    this.`post` = model_LifecycleHook()
  }

  this.`post`.block()
}


fun  model_RollingDeploymentStrategyParams.`post`(block: model_LifecycleHook.() -> Unit = {}) {
  if(this.`post` == null) {
    this.`post` = model_LifecycleHook()
  }

  this.`post`.block()
}

