// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus
import io.fabric8.openshift.api.model.PowerVSPlatformSpec as model_PowerVSPlatformSpec
import io.fabric8.openshift.api.model.PowerVSPlatformStatus as model_PowerVSPlatformStatus


fun  model_PlatformSpec.`powervs`(block: model_PowerVSPlatformSpec.() -> Unit = {}) {
  if(this.`powervs` == null) {
    this.`powervs` = model_PowerVSPlatformSpec()
  }

  this.`powervs`.block()
}


fun  model_PlatformStatus.`powervs`(block: model_PowerVSPlatformStatus.() -> Unit = {}) {
  if(this.`powervs` == null) {
    this.`powervs` = model_PowerVSPlatformStatus()
  }

  this.`powervs`.block()
}

