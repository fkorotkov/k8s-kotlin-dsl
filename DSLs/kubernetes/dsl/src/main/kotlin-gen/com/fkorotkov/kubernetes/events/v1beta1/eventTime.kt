// GENERATED
package com.fkorotkov.kubernetes.events.v1beta1

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.v1beta1.Event as v1beta1_Event


fun  v1beta1_Event.`eventTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`eventTime` == null) {
    this.`eventTime` = model_MicroTime()
  }

  this.`eventTime`.block()
}

