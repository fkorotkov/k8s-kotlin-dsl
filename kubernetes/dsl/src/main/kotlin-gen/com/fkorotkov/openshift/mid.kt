// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook
import io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams


fun  RecreateDeploymentStrategyParams.`mid`(block: LifecycleHook.() -> Unit = {}) {
  if(this.`mid` == null) {
    this.`mid` = LifecycleHook()
  }

  this.`mid`.block()
}

