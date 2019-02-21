// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus


fun  NodeConfigStatus.`lastKnownGood`(block: NodeConfigSource.() -> Unit = {}) {
  if(this.`lastKnownGood` == null) {
    this.`lastKnownGood` = NodeConfigSource()
  }

  this.`lastKnownGood`.block()
}

