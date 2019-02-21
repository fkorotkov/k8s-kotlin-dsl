// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSelector
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity


fun  VolumeNodeAffinity.`required`(block: NodeSelector.() -> Unit = {}) {
  if(this.`required` == null) {
    this.`required` = NodeSelector()
  }

  this.`required`.block()
}

