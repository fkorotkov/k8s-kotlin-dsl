// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventSeries as model_EventSeries


fun  model_Event.`series`(block: model_EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = model_EventSeries()
  }

  this.`series`.block()
}

