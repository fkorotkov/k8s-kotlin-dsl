// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapEnvSource as model_ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.EnvFromSource as model_EnvFromSource


fun  model_EnvFromSource.`configMapRef`(block: model_ConfigMapEnvSource.() -> Unit = {}) {
  if(this.`configMapRef` == null) {
    this.`configMapRef` = model_ConfigMapEnvSource()
  }

  this.`configMapRef`.block()
}

