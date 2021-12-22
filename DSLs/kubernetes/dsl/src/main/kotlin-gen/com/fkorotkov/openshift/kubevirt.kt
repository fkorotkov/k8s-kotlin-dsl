// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.KubevirtPlatformSpec as model_KubevirtPlatformSpec
import io.fabric8.openshift.api.model.KubevirtPlatformStatus as model_KubevirtPlatformStatus
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec
import io.fabric8.openshift.api.model.PlatformStatus as model_PlatformStatus


fun  model_PlatformSpec.`kubevirt`(block: model_KubevirtPlatformSpec.() -> Unit = {}) {
  if(this.`kubevirt` == null) {
    this.`kubevirt` = model_KubevirtPlatformSpec()
  }

  this.`kubevirt`.block()
}


fun  model_PlatformStatus.`kubevirt`(block: model_KubevirtPlatformStatus.() -> Unit = {}) {
  if(this.`kubevirt` == null) {
    this.`kubevirt` = model_KubevirtPlatformStatus()
  }

  this.`kubevirt`.block()
}

