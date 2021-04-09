// GENERATED
package com.fkorotkov.kubernetes.events.v1

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.events.v1.Event as v1_Event


fun  v1_Event.`related`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`related` == null) {
    this.`related` = model_ObjectReference()
  }

  this.`related`.block()
}

