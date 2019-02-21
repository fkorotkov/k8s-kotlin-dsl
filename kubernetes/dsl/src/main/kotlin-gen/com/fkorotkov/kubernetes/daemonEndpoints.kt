// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints as model_NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus


fun  model_NodeStatus.`daemonEndpoints`(block: model_NodeDaemonEndpoints.() -> Unit = {}) {
  if(this.`daemonEndpoints` == null) {
    this.`daemonEndpoints` = model_NodeDaemonEndpoints()
  }

  this.`daemonEndpoints`.block()
}

