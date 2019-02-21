// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus


fun  model_NodeConfigStatus.`active`(block: model_NodeConfigSource.() -> Unit = {}) {
  if(this.`active` == null) {
    this.`active` = model_NodeConfigSource()
  }

  this.`active`.block()
}

