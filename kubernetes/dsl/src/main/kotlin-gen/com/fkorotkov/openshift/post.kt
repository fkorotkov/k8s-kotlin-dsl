// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams


fun  RecreateDeploymentStrategyParams.`post`(block: LifecycleHook.() -> Unit = {}) {
  if(this.`post` == null) {
    this.`post` = LifecycleHook()
  }

  this.`post`.block()
}


fun  RollingDeploymentStrategyParams.`post`(block: LifecycleHook.() -> Unit = {}) {
  if(this.`post` == null) {
    this.`post` = LifecycleHook()
  }

  this.`post`.block()
}

