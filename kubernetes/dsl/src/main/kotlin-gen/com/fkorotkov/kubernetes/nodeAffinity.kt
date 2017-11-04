// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.NodeAffinity


fun  Affinity.`nodeAffinity`(block: NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = NodeAffinity()
  }

  this.`nodeAffinity`.block()
}

