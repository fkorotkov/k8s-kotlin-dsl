// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference
import io.fabric8.openshift.api.model.SecretBuildSource


fun  SecretBuildSource.`secret`(block: LocalObjectReference.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = LocalObjectReference()
  }

  this.`secret`.block()
}

