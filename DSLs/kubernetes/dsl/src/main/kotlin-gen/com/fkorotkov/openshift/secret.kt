// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.openshift.api.model.SecretBuildSource as model_SecretBuildSource


fun  model_SecretBuildSource.`secret`(block: model_LocalObjectReference.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = model_LocalObjectReference()
  }

  this.`secret`.block()
}

