// GENERATED
package com.fkorotkov.kubernetes.events.v1beta1

import io.fabric8.kubernetes.api.model.events.v1beta1.Event as v1beta1_Event
import io.fabric8.kubernetes.api.model.events.v1beta1.EventSeries as v1beta1_EventSeries


fun  v1beta1_Event.`series`(block: v1beta1_EventSeries.() -> Unit = {}) {
  if(this.`series` == null) {
    this.`series` = v1beta1_EventSeries()
  }

  this.`series`.block()
}

