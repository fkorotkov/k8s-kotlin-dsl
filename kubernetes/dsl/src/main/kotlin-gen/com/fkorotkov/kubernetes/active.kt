// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus


fun  NodeConfigStatus.`active`(block: NodeConfigSource.() -> Unit = {}) {
  if(this.`active` == null) {
    this.`active` = NodeConfigSource()
  }

  this.`active`.block()
}

