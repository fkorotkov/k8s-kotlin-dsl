// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventSource as model_EventSource


fun  model_Event.`source`(block: model_EventSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = model_EventSource()
  }

  this.`source`.block()
}

