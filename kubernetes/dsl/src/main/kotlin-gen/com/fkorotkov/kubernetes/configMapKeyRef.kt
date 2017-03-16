// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapKeySelector
import io.fabric8.kubernetes.api.model.EnvVarSource


fun  EnvVarSource.`configMapKeyRef`(block: ConfigMapKeySelector.() -> Unit = {}) {
  if(this.`configMapKeyRef` == null) {
    this.`configMapKeyRef` = ConfigMapKeySelector()
  }

  this.`configMapKeyRef`.block()
}

