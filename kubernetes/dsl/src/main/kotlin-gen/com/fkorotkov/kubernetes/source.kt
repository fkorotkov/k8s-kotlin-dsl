// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventSource


fun  Event.`source`(block: EventSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = EventSource()
  }

  this.`source`.block()
}

