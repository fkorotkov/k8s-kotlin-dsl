// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeSpec as model_NodeSpec


fun  model_NodeSpec.`configSource`(block: model_NodeConfigSource.() -> Unit = {}) {
  if(this.`configSource` == null) {
    this.`configSource` = model_NodeConfigSource()
  }

  this.`configSource`.block()
}

