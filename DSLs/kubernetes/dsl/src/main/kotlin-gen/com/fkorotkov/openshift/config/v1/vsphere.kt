// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformSpec as v1_VSpherePlatformSpec
import io.fabric8.openshift.api.model.config.v1.VSpherePlatformStatus as v1_VSpherePlatformStatus


fun  v1_PlatformSpec.`vsphere`(block: v1_VSpherePlatformSpec.() -> Unit = {}) {
  if(this.`vsphere` == null) {
    this.`vsphere` = v1_VSpherePlatformSpec()
  }

  this.`vsphere`.block()
}


fun  v1_PlatformStatus.`vsphere`(block: v1_VSpherePlatformStatus.() -> Unit = {}) {
  if(this.`vsphere` == null) {
    this.`vsphere` = v1_VSpherePlatformStatus()
  }

  this.`vsphere`.block()
}

