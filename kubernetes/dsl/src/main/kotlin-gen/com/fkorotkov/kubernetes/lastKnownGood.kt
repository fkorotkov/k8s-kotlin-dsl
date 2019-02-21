// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus


fun  model_NodeConfigStatus.`lastKnownGood`(block: model_NodeConfigSource.() -> Unit = {}) {
  if(this.`lastKnownGood` == null) {
    this.`lastKnownGood` = model_NodeConfigSource()
  }

  this.`lastKnownGood`.block()
}

