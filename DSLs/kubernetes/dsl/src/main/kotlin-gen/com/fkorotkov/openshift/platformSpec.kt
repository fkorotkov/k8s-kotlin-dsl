// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.InfrastructureSpec as model_InfrastructureSpec
import io.fabric8.openshift.api.model.PlatformSpec as model_PlatformSpec


fun  model_InfrastructureSpec.`platformSpec`(block: model_PlatformSpec.() -> Unit = {}) {
  if(this.`platformSpec` == null) {
    this.`platformSpec` = model_PlatformSpec()
  }

  this.`platformSpec`.block()
}

