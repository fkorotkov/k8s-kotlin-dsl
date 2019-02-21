// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus


fun  NodeConfigStatus.`assigned`(block: NodeConfigSource.() -> Unit = {}) {
  if(this.`assigned` == null) {
    this.`assigned` = NodeConfigSource()
  }

  this.`assigned`.block()
}

