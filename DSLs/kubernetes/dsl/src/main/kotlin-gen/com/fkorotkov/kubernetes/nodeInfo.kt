// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus
import io.fabric8.kubernetes.api.model.NodeSystemInfo as model_NodeSystemInfo


fun  model_NodeStatus.`nodeInfo`(block: model_NodeSystemInfo.() -> Unit = {}) {
  if(this.`nodeInfo` == null) {
    this.`nodeInfo` = model_NodeSystemInfo()
  }

  this.`nodeInfo`.block()
}

