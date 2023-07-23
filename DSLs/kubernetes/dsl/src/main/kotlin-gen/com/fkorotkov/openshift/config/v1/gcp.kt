// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.GCPPlatformSpec as v1_GCPPlatformSpec
import io.fabric8.openshift.api.model.config.v1.GCPPlatformStatus as v1_GCPPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`gcp`(block: v1_GCPPlatformSpec.() -> Unit = {}) {
  if(this.`gcp` == null) {
    this.`gcp` = v1_GCPPlatformSpec()
  }

  this.`gcp`.block()
}


fun  v1_PlatformStatus.`gcp`(block: v1_GCPPlatformStatus.() -> Unit = {}) {
  if(this.`gcp` == null) {
    this.`gcp` = v1_GCPPlatformStatus()
  }

  this.`gcp`.block()
}

