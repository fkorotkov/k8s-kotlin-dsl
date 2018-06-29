// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.MicroTime


fun  Event.`eventTime`(block: MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = MicroTime()
  }

  this.`eventTime`.block()
}

