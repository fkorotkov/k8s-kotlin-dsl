// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventSeries


fun  Event.`series`(block: EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = EventSeries()
  }

  this.`series`.block()
}

