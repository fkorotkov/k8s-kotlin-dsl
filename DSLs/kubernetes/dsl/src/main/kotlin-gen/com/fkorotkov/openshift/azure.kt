// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.AzurePlatformSpec as model_AzurePlatformSpec
import io.fabric8.openshift.api.model.AzurePlatformStatus as model_AzurePlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`azure`(block: model_AzurePlatformSpec.() -> Unit = {}) {
  if(this.`azure` == null) {
    this.`azure` = model_AzurePlatformSpec()
  }

  this.`azure`.block()
}


fun  model_PlatformStatus.`azure`(block: model_AzurePlatformStatus.() -> Unit = {}) {
  if(this.`azure` == null) {
    this.`azure` = model_AzurePlatformStatus()
  }

  this.`azure`.block()
}

