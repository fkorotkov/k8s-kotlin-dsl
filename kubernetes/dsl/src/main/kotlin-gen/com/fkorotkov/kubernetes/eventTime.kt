// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.MicroTime
import io.fabric8.kubernetes.api.model.events.Event


fun  Event.`eventTime`(block: MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = MicroTime()
  }

  this.`eventTime`.block()
}


fun  Event.`eventTime`(block: MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = MicroTime()
  }

  this.`eventTime`.block()
}

