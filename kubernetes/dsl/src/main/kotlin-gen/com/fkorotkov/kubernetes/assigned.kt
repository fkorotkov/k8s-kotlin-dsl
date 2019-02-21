// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus


fun  model_NodeConfigStatus.`assigned`(block: model_NodeConfigSource.() -> Unit = {}) {
  if(this.`assigned` == null) {
    this.`assigned` = model_NodeConfigSource()
  }

  this.`assigned`.block()
}

