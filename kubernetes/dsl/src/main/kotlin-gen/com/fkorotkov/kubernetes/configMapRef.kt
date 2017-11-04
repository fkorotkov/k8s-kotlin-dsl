// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.EnvFromSource


fun  EnvFromSource.`configMapRef`(block: ConfigMapEnvSource.() -> Unit = {}) {
  if(this.`configMapRef` == null) {
    this.`configMapRef` = ConfigMapEnvSource()
  }

  this.`configMapRef`.block()
}

