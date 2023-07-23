// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.InfrastructureSpec as v1_InfrastructureSpec
import io.fabric8.openshift.api.model.config.v1.PlatformSpec as v1_PlatformSpec


fun  v1_InfrastructureSpec.`platformSpec`(block: v1_PlatformSpec.() -> Unit = {}) {
  if(this.`platformSpec` == null) {
    this.`platformSpec` = v1_PlatformSpec()
  }

  this.`platformSpec`.block()
}

