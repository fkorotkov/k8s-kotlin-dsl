// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus as model_ContainerStatus


fun  model_ContainerStatus.`state`(block: model_ContainerState.() -> Unit = {}) {
  if(this.`state` == null) {
    this.`state` = model_ContainerState()
  }

  this.`state`.block()
}

