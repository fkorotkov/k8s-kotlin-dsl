// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapKeySelector as model_ConfigMapKeySelector
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource


fun  model_EnvVarSource.`configMapKeyRef`(block: model_ConfigMapKeySelector.() -> Unit = {}) {
  if(this.`configMapKeyRef` == null) {
    this.`configMapKeyRef` = model_ConfigMapKeySelector()
  }

  this.`configMapKeyRef`.block()
}

