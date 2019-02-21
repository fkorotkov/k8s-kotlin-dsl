// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.SecretKeySelector as model_SecretKeySelector


fun  model_EnvVarSource.`secretKeyRef`(block: model_SecretKeySelector.() -> Unit = {}) {
  if(this.`secretKeyRef` == null) {
    this.`secretKeyRef` = model_SecretKeySelector()
  }

  this.`secretKeyRef`.block()
}

