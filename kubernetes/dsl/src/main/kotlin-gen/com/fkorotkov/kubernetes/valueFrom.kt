// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EnvVar as model_EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource


fun  model_EnvVar.`valueFrom`(block: model_EnvVarSource.() -> Unit = {}) {
  if(this.`valueFrom` == null) {
    this.`valueFrom` = model_EnvVarSource()
  }

  this.`valueFrom`.block()
}

