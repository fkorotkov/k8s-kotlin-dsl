// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus as model_ContainerStatus


fun  model_ContainerStatus.`lastState`(block: model_ContainerState.() -> Unit = {}) {
  if(this.`lastState` == null) {
    this.`lastState` = model_ContainerState()
  }

  this.`lastState`.block()
}

