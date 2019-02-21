// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.events.Event as events_Event


fun  events_Event.`regarding`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`regarding` == null) {
    this.`regarding` = model_ObjectReference()
  }

  this.`regarding`.block()
}

