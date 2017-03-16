// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeStatus


fun  NodeStatus.`daemonEndpoints`(block: NodeDaemonEndpoints.() -> Unit = {}) {
  if(this.`daemonEndpoints` == null) {
    this.`daemonEndpoints` = NodeDaemonEndpoints()
  }

  this.`daemonEndpoints`.block()
}

