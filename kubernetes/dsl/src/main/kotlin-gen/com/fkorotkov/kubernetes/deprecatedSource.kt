// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EventSource
import io.fabric8.kubernetes.api.model.events.Event


fun  Event.`deprecatedSource`(block: EventSource.() -> Unit = {}) {
  if(this.`deprecatedSource` == null) {
    this.`deprecatedSource` = EventSource()
  }

  this.`deprecatedSource`.block()
}

