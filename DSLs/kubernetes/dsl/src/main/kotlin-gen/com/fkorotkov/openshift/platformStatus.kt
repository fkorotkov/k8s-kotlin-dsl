// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.InfrastructureStatus as model_InfrastructureStatus
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_InfrastructureStatus.`platformStatus`(block: model_PlatformStatus.() -> Unit = {}) {
  if(this.`platformStatus` == null) {
    this.`platformStatus` = model_PlatformStatus()
  }

  this.`platformStatus`.block()
}

