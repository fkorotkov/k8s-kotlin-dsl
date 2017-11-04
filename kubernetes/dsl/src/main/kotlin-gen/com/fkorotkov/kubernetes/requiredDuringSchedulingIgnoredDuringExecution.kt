// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeAffinity
import io.fabric8.kubernetes.api.model.NodeSelector


fun  NodeAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: NodeSelector.() -> Unit = {}) {
  if(this.`requiredDuringSchedulingIgnoredDuringExecution` == null) {
    this.`requiredDuringSchedulingIgnoredDuringExecution` = NodeSelector()
  }

  this.`requiredDuringSchedulingIgnoredDuringExecution`.block()
}

