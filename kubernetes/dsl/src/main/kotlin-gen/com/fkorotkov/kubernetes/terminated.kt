// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateTerminated


fun  ContainerState.`terminated`(block: ContainerStateTerminated.() -> Unit = {}) {
  if(this.`terminated` == null) {
    this.`terminated` = ContainerStateTerminated()
  }

  this.`terminated`.block()
}

