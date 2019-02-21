// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.EventSeries
import io.fabric8.kubernetes.api.model.events.Event
import io.fabric8.kubernetes.api.model.events.EventSeries


fun  Event.`series`(block: EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = EventSeries()
  }

  this.`series`.block()
}


fun  Event.`series`(block: EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = EventSeries()
  }

  this.`series`.block()
}

