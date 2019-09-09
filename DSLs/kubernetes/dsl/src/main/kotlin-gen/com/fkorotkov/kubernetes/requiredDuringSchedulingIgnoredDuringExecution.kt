// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeAffinity as model_NodeAffinity
import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector


fun  model_NodeAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: model_NodeSelector.() -> Unit = {}) {
  if(this.`requiredDuringSchedulingIgnoredDuringExecution` == null) {
    this.`requiredDuringSchedulingIgnoredDuringExecution` = model_NodeSelector()
  }

  this.`requiredDuringSchedulingIgnoredDuringExecution`.block()
}

