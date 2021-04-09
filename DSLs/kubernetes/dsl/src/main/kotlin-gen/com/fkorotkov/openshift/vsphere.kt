// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus
import io.fabric8.openshift.api.model.VSpherePlatformSpec as model_VSpherePlatformSpec
import io.fabric8.openshift.api.model.VSpherePlatformStatus as model_VSpherePlatformStatus


fun  model_PlatformSpec.`vsphere`(block: model_VSpherePlatformSpec.() -> Unit = {}) {
  if(this.`vsphere` == null) {
    this.`vsphere` = model_VSpherePlatformSpec()
  }

  this.`vsphere`.block()
}


fun  model_PlatformStatus.`vsphere`(block: model_VSpherePlatformStatus.() -> Unit = {}) {
  if(this.`vsphere` == null) {
    this.`vsphere` = model_VSpherePlatformStatus()
  }

  this.`vsphere`.block()
}

