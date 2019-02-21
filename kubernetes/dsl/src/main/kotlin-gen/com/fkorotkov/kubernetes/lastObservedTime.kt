// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EventSeries as model_EventSeries
import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime


fun  model_EventSeries.`lastObservedTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = model_MicroTime()
  }

  this.`lastObservedTime`.block()
}

