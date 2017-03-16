// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EnvVarSource
import io.fabric8.kubernetes.api.model.SecretKeySelector


fun  EnvVarSource.`secretKeyRef`(block: SecretKeySelector.() -> Unit = {}) {
  if(this.`secretKeyRef` == null) {
    this.`secretKeyRef` = SecretKeySelector()
  }

  this.`secretKeyRef`.block()
}

