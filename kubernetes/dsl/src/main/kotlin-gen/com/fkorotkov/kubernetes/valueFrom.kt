// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource


fun  EnvVar.`valueFrom`(block: EnvVarSource.() -> Unit = {}) {
  if(this.`valueFrom` == null) {
    this.`valueFrom` = EnvVarSource()
  }

  this.`valueFrom`.block()
}

