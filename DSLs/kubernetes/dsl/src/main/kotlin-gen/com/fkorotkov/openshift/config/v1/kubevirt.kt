// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.KubevirtPlatformSpec as v1_KubevirtPlatformSpec
import io.fabric8.openshift.api.model.config.v1.KubevirtPlatformStatus as v1_KubevirtPlatformStatus
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec
import io.fabric8.openshift.api.model.config.v1.PlatformStatus as v1_PlatformStatus


fun  v1_PlatformSpec.`kubevirt`(block: v1_KubevirtPlatformSpec.() -> Unit = {}) {
  if(this.`kubevirt` == null) {
    this.`kubevirt` = v1_KubevirtPlatformSpec()
  }

  this.`kubevirt`.block()
}


fun  v1_PlatformStatus.`kubevirt`(block: v1_KubevirtPlatformStatus.() -> Unit = {}) {
  if(this.`kubevirt` == null) {
    this.`kubevirt` = v1_KubevirtPlatformStatus()
  }

  this.`kubevirt`.block()
}

