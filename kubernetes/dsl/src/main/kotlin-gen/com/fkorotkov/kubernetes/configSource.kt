// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeSpec


fun  NodeSpec.`configSource`(block: NodeConfigSource.() -> Unit = {}) {
  if(this.`configSource` == null) {
    this.`configSource` = NodeConfigSource()
  }

  this.`configSource`.block()
}

