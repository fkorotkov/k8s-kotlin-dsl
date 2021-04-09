// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GCPPlatformSpec as model_GCPPlatformSpec
import io.fabric8.openshift.api.model.GCPPlatformStatus as model_GCPPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`gcp`(block: model_GCPPlatformSpec.() -> Unit = {}) {
  if(this.`gcp` == null) {
    this.`gcp` = model_GCPPlatformSpec()
  }

  this.`gcp`.block()
}


fun  model_PlatformStatus.`gcp`(block: model_GCPPlatformStatus.() -> Unit = {}) {
  if(this.`gcp` == null) {
    this.`gcp` = model_GCPPlatformStatus()
  }

  this.`gcp`.block()
}

