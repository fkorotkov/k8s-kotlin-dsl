// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus


fun  ContainerStatus.`state`(block: ContainerState.() -> Unit = {}) {
  if(this.`state` == null) {
    this.`state` = ContainerState()
  }

  this.`state`.block()
}

