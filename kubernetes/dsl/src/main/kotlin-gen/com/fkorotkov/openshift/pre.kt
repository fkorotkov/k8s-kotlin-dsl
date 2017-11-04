// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams
import io.fabric8.openshift.api.model.RollingDeploymentStrategyParams


fun  RecreateDeploymentStrategyParams.`pre`(block: LifecycleHook.() -> Unit = {}) {
  if(this.`pre` == null) {
    this.`pre` = LifecycleHook()
  }

  this.`pre`.block()
}


fun  RollingDeploymentStrategyParams.`pre`(block: LifecycleHook.() -> Unit = {}) {
  if(this.`pre` == null) {
    this.`pre` = LifecycleHook()
  }

  this.`pre`.block()
}

