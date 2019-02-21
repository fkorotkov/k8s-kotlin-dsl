// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateTerminated as model_ContainerStateTerminated


fun  model_ContainerState.`terminated`(block: model_ContainerStateTerminated.() -> Unit = {}) {
  if(this.`terminated` == null) {
    this.`terminated` = model_ContainerStateTerminated()
  }

  this.`terminated`.block()
}

