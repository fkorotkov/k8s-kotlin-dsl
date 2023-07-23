// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus
import io.fabric8.openshift.api.model.config.v1.PowerVSPlatformSpec as v1_PowerVSPlatformSpec
import io.fabric8.openshift.api.model.config.v1.PowerVSPlatformStatus as v1_PowerVSPlatformStatus


fun  v1_PlatformSpec.`powervs`(block: v1_PowerVSPlatformSpec.() -> Unit = {}) {
  if(this.`powervs` == null) {
    this.`powervs` = v1_PowerVSPlatformSpec()
  }

  this.`powervs`.block()
}


fun  v1_PlatformStatus.`powervs`(block: v1_PowerVSPlatformStatus.() -> Unit = {}) {
  if(this.`powervs` == null) {
    this.`powervs` = v1_PowerVSPlatformStatus()
  }

  this.`powervs`.block()
}

