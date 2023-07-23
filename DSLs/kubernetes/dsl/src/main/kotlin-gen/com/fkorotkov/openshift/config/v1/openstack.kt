// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformSpec as v1_OpenStackPlatformSpec
import io.fabric8.openshift.api.model.config.v1.OpenStackPlatformStatus as v1_OpenStackPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`openstack`(block: v1_OpenStackPlatformSpec.() -> Unit = {}) {
  if(this.`openstack` == null) {
    this.`openstack` = v1_OpenStackPlatformSpec()
  }

  this.`openstack`.block()
}


fun  v1_PlatformStatus.`openstack`(block: v1_OpenStackPlatformStatus.() -> Unit = {}) {
  if(this.`openstack` == null) {
    this.`openstack` = v1_OpenStackPlatformStatus()
  }

  this.`openstack`.block()
}

