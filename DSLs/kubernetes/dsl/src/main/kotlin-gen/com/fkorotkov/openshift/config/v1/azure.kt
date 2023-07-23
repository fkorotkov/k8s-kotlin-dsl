// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.AzurePlatformSpec as v1_AzurePlatformSpec
import io.fabric8.openshift.api.model.config.v1.AzurePlatformStatus as v1_AzurePlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`azure`(block: v1_AzurePlatformSpec.() -> Unit = {}) {
  if(this.`azure` == null) {
    this.`azure` = v1_AzurePlatformSpec()
  }

  this.`azure`.block()
}


fun  v1_PlatformStatus.`azure`(block: v1_AzurePlatformStatus.() -> Unit = {}) {
  if(this.`azure` == null) {
    this.`azure` = v1_AzurePlatformStatus()
  }

  this.`azure`.block()
}

