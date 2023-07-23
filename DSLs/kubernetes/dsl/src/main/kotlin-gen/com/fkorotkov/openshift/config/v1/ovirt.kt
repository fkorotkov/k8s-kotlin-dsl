// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OvirtPlatformSpec as v1_OvirtPlatformSpec
import io.fabric8.openshift.api.model.config.v1.OvirtPlatformStatus as v1_OvirtPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`ovirt`(block: v1_OvirtPlatformSpec.() -> Unit = {}) {
  if(this.`ovirt` == null) {
    this.`ovirt` = v1_OvirtPlatformSpec()
  }

  this.`ovirt`.block()
}


fun  v1_PlatformStatus.`ovirt`(block: v1_OvirtPlatformStatus.() -> Unit = {}) {
  if(this.`ovirt` == null) {
    this.`ovirt` = v1_OvirtPlatformStatus()
  }

  this.`ovirt`.block()
}

