// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.SecurityContext


fun  Container.`securityContext`(block: SecurityContext.() -> Unit = {}) {
  if(this.`securityContext` == null) {
    this.`securityContext` = SecurityContext()
  }

  this.`securityContext`.block()
}


fun  PodSpec.`securityContext`(block: PodSecurityContext.() -> Unit = {}) {
  if(this.`securityContext` == null) {
    this.`securityContext` = PodSecurityContext()
  }

  this.`securityContext`.block()
}

