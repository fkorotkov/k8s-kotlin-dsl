// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigStatus
import io.fabric8.kubernetes.api.model.NodeStatus


fun  NodeStatus.`config`(block: NodeConfigStatus.() -> Unit = {}) {
  if(this.`config` == null) {
    this.`config` = NodeConfigStatus()
  }

  this.`config`.block()
}

