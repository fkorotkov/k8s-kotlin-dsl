// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateRunning as model_ContainerStateRunning


fun  model_ContainerState.`running`(block: model_ContainerStateRunning.() -> Unit = {}) {
  if(this.`running` == null) {
    this.`running` = model_ContainerStateRunning()
  }

  this.`running`.block()
}

