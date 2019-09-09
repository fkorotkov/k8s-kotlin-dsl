// GENERATED
package com.fkorotkov.kubernetes.events

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.events.Event as events_Event


fun  events_Event.`related`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`related` == null) {
    this.`related` = model_ObjectReference()
  }

  this.`related`.block()
}

