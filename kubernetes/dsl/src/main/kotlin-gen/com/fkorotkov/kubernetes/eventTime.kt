// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime


fun  model_Event.`eventTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = model_MicroTime()
  }

  this.`eventTime`.block()
}

