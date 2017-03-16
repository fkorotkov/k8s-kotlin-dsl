// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateWaiting


fun  ContainerState.`waiting`(block: ContainerStateWaiting.() -> Unit = {}) {
  if(this.`waiting` == null) {
    this.`waiting` = ContainerStateWaiting()
  }

  this.`waiting`.block()
}

