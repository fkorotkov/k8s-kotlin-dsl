// GENERATED
package com.fkorotkov.kubernetes.events.v1

import io.fabric8.kubernetes.api.model.events.v1.Event as v1_Event
import io.fabric8.kubernetes.api.model.events.v1.EventSeries as v1_EventSeries


fun  v1_Event.`series`(block: v1_EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = v1_EventSeries()
  }

  this.`series`.block()
}

