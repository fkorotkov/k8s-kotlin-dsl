// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.Event as events_Event


fun  events_Event.`eventTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = model_MicroTime()
  }

  this.`eventTime`.block()
}

