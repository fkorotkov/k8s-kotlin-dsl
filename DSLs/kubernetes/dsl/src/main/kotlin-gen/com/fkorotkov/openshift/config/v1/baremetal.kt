// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformSpec as v1_BareMetalPlatformSpec
import io.fabric8.openshift.api.model.config.v1.BareMetalPlatformStatus as v1_BareMetalPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`baremetal`(block: v1_BareMetalPlatformSpec.() -> Unit = {}) {
  if(this.`baremetal` == null) {
    this.`baremetal` = v1_BareMetalPlatformSpec()
  }

  this.`baremetal`.block()
}


fun  v1_PlatformStatus.`baremetal`(block: v1_BareMetalPlatformStatus.() -> Unit = {}) {
  if(this.`baremetal` == null) {
    this.`baremetal` = v1_BareMetalPlatformStatus()
  }

  this.`baremetal`.block()
}

