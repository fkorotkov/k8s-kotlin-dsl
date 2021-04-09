// GENERATED
package com.fkorotkov.kubernetes.events.v1beta1

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.v1beta1.EventSeries as v1beta1_EventSeries


fun  v1beta1_EventSeries.`lastObservedTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`lastObservedTime` == null) {
    this.`lastObservedTime` = model_MicroTime()
  }

  this.`lastObservedTime`.block()
}

