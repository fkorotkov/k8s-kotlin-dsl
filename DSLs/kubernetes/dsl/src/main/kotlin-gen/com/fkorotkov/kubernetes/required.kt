// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity as model_VolumeNodeAffinity


fun  model_VolumeNodeAffinity.`required`(block: model_NodeSelector.() -> Unit = {}) {
  if(this.`required` == null) {
    this.`required` = model_NodeSelector()
  }

  this.`required`.block()
}

