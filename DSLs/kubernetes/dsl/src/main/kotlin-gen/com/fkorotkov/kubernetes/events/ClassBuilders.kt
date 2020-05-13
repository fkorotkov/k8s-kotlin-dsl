// GENERATE
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.events.Event as events_Event
import io.fabric8.kubernetes.api.model.events.EventList as events_EventList
import io.fabric8.kubernetes.api.model.events.EventSeries as events_EventSeries


fun newEvent(block : events_Event.() -> Unit = {}): events_Event {
  val instance = events_Event()
  instance.block()
  return instance
}


fun newEventList(block : events_EventList.() -> Unit = {}): events_EventList {
  val instance = events_EventList()
  instance.block()
  return instance
}


fun newEventSeries(block : events_EventSeries.() -> Unit = {}): events_EventSeries {
  val instance = events_EventSeries()
  instance.block()
  return instance
}

