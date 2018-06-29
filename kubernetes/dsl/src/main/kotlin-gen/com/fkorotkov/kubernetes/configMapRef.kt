// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.EnvFromSource
import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.ObjectReference


fun  EnvFromSource.`configMapRef`(block: ConfigMapEnvSource.() -> Unit = {}) {
  if(this.`configMapRef` == null) {
    this.`configMapRef` = ConfigMapEnvSource()
  }

  this.`configMapRef`.block()
}


fun  NodeConfigSource.`configMapRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`configMapRef` == null) {
    this.`configMapRef` = ObjectReference()
  }

  this.`configMapRef`.block()
}

