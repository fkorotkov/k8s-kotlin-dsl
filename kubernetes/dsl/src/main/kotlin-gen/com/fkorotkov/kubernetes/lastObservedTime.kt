// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EventSeries
import io.fabric8.kubernetes.api.model.MicroTime
import io.fabric8.kubernetes.api.model.events.EventSeries


fun  EventSeries.`lastObservedTime`(block: MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = MicroTime()
  }

  this.`lastObservedTime`.block()
}


fun  EventSeries.`lastObservedTime`(block: MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = MicroTime()
  }

  this.`lastObservedTime`.block()
}

