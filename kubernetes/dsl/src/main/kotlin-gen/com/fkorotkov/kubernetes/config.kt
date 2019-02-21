// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus


fun  model_NodeStatus.`config`(block: model_NodeConfigStatus.() -> Unit = {}) {
  if(this.`config` == null) {
    this.`config` = model_NodeConfigStatus()
  }

  this.`config`.block()
}

