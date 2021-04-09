// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenStackPlatformSpec as model_OpenStackPlatformSpec
import io.fabric8.openshift.api.model.OpenStackPlatformStatus as model_OpenStackPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`openstack`(block: model_OpenStackPlatformSpec.() -> Unit = {}) {
  if(this.`openstack` == null) {
    this.`openstack` = model_OpenStackPlatformSpec()
  }

  this.`openstack`.block()
}


fun  model_PlatformStatus.`openstack`(block: model_OpenStackPlatformStatus.() -> Unit = {}) {
  if(this.`openstack` == null) {
    this.`openstack` = model_OpenStackPlatformStatus()
  }

  this.`openstack`.block()
}

