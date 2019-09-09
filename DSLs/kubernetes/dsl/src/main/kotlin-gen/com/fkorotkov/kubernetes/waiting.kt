// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateWaiting as model_ContainerStateWaiting


fun  model_ContainerState.`waiting`(block: model_ContainerStateWaiting.() -> Unit = {}) {
  if(this.`waiting` == null) {
    this.`waiting` = model_ContainerStateWaiting()
  }

  this.`waiting`.block()
}

