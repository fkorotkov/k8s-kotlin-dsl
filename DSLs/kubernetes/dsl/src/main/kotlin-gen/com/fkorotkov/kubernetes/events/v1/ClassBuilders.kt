// GENERATE
package com.fkorotkov.kubernetes.events.v1

import io.fabric8.kubernetes.api.model.events.v1.Event as v1_Event
import io.fabric8.kubernetes.api.model.events.v1.EventList as v1_EventList
import io.fabric8.kubernetes.api.model.events.v1.EventSeries as v1_EventSeries


fun newEvent(block : v1_Event.() -> Unit = {}): v1_Event {
  val instance = v1_Event()
  instance.block()
  return instance
}


fun newEventList(block : v1_EventList.() -> Unit = {}): v1_EventList {
  val instance = v1_EventList()
  instance.block()
  return instance
}


fun newEventSeries(block : v1_EventSeries.() -> Unit = {}): v1_EventSeries {
  val instance = v1_EventSeries()
  instance.block()
  return instance
}

