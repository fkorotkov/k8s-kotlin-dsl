// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.EventSource as model_EventSource
import io.fabric8.kubernetes.api.model.events.Event as events_Event


fun  events_Event.`deprecatedSource`(block: model_EventSource.() -> Unit = {}) {
  if(this.`deprecatedSource` == null) {
    this.`deprecatedSource` = model_EventSource()
  }

  this.`deprecatedSource`.block()
}

