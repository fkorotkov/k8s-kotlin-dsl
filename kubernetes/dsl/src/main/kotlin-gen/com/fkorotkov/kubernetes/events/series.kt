// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.events.Event as events_Event
import io.fabric8.kubernetes.api.model.events.EventSeries as events_EventSeries


fun  events_Event.`series`(block: events_EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = events_EventSeries()
  }

  this.`series`.block()
}

