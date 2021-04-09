// GENERATE
package com.fkorotkov.kubernetes.events.v1beta1

import io.fabric8.kubernetes.api.model.events.v1beta1.Event as v1beta1_Event
import io.fabric8.kubernetes.api.model.events.v1beta1.EventList as v1beta1_EventList
import io.fabric8.kubernetes.api.model.events.v1beta1.EventSeries as v1beta1_EventSeries


fun newEvent(block : v1beta1_Event.() -> Unit = {}): v1beta1_Event {
  val instance = v1beta1_Event()
  instance.block()
  return instance
}


fun newEventList(block : v1beta1_EventList.() -> Unit = {}): v1beta1_EventList {
  val instance = v1beta1_EventList()
  instance.block()
  return instance
}


fun newEventSeries(block : v1beta1_EventSeries.() -> Unit = {}): v1beta1_EventSeries {
  val instance = v1beta1_EventSeries()
  instance.block()
  return instance
}

