// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OvirtPlatformSpec as model_OvirtPlatformSpec
import io.fabric8.openshift.api.model.OvirtPlatformStatus as model_OvirtPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`ovirt`(block: model_OvirtPlatformSpec.() -> Unit = {}) {
  if(this.`ovirt` == null) {
    this.`ovirt` = model_OvirtPlatformSpec()
  }

  this.`ovirt`.block()
}


fun  model_PlatformStatus.`ovirt`(block: model_OvirtPlatformStatus.() -> Unit = {}) {
  if(this.`ovirt` == null) {
    this.`ovirt` = model_OvirtPlatformStatus()
  }

  this.`ovirt`.block()
}

