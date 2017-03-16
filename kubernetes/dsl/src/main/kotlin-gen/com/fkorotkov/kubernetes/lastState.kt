// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus


fun  ContainerStatus.`lastState`(block: ContainerState.() -> Unit = {}) {
  if(this.`lastState` == null) {
    this.`lastState` = ContainerState()
  }

  this.`lastState`.block()
}

