// GENERATED
package com.fkorotkov.kubernetes.events.v1

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.v1.EventSeries as v1_EventSeries


fun  v1_EventSeries.`lastObservedTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = model_MicroTime()
  }

  this.`lastObservedTime`.block()
}

