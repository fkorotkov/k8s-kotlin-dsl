// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeStatus
import io.fabric8.kubernetes.api.model.NodeSystemInfo


fun  NodeStatus.`nodeInfo`(block: NodeSystemInfo.() -> Unit = {}) {
  if(this.`nodeInfo` == null) {
    this.`nodeInfo` = NodeSystemInfo()
  }

  this.`nodeInfo`.block()
}

