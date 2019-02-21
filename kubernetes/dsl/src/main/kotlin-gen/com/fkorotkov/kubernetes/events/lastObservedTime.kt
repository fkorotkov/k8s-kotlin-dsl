// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.EventSeries as events_EventSeries


fun  events_EventSeries.`lastObservedTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = model_MicroTime()
  }

  this.`lastObservedTime`.block()
}

