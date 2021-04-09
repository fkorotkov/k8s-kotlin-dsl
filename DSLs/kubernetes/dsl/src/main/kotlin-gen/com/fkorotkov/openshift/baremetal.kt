// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BareMetalPlatformSpec as model_BareMetalPlatformSpec
import io.fabric8.openshift.api.model.BareMetalPlatformStatus as model_BareMetalPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`baremetal`(block: model_BareMetalPlatformSpec.() -> Unit = {}) {
  if(this.`baremetal` == null) {
    this.`baremetal` = model_BareMetalPlatformSpec()
  }

  this.`baremetal`.block()
}


fun  model_PlatformStatus.`baremetal`(block: model_BareMetalPlatformStatus.() -> Unit = {}) {
  if(this.`baremetal` == null) {
    this.`baremetal` = model_BareMetalPlatformStatus()
  }

  this.`baremetal`.block()
}

