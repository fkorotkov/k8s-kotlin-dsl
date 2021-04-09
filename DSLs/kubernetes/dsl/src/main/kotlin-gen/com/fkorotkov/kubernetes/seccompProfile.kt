// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SeccompProfile as model_SeccompProfile
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext


fun  model_PodSecurityContext.`seccompProfile`(block: model_SeccompProfile.() -> Unit = {}) {
  if(this.`seccompProfile` == null) {
    this.`seccompProfile` = model_SeccompProfile()
  }

  this.`seccompProfile`.block()
}


fun  model_SecurityContext.`seccompProfile`(block: model_SeccompProfile.() -> Unit = {}) {
  if(this.`seccompProfile` == null) {
    this.`seccompProfile` = model_SeccompProfile()
  }

  this.`seccompProfile`.block()
}

