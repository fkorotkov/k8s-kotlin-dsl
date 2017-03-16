// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateRunning


fun  ContainerState.`running`(block: ContainerStateRunning.() -> Unit = {}) {
  if(this.`running` == null) {
    this.`running` = ContainerStateRunning()
  }

  this.`running`.block()
}

