// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext


fun  model_Container.`securityContext`(block: model_SecurityContext.() -> Unit = {}) {
  if(this.`securityContext` == null) {
    this.`securityContext` = model_SecurityContext()
  }

  this.`securityContext`.block()
}


fun  model_EphemeralContainer.`securityContext`(block: model_SecurityContext.() -> Unit = {}) {
  if(this.`securityContext` == null) {
    this.`securityContext` = model_SecurityContext()
  }

  this.`securityContext`.block()
}


fun  model_PodSpec.`securityContext`(block: model_PodSecurityContext.() -> Unit = {}) {
  if(this.`securityContext` == null) {
    this.`securityContext` = model_PodSecurityContext()
  }

  this.`securityContext`.block()
}

