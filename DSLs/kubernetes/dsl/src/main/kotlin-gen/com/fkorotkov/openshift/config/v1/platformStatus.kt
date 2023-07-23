// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.InfrastructureStatus as v1_InfrastructureStatus
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_InfrastructureStatus.`platformStatus`(block: v1_PlatformStatus.() -> Unit = {}) {
  if(this.`platformStatus` == null) {
    this.`platformStatus` = v1_PlatformStatus()
  }

  this.`platformStatus`.block()
}

