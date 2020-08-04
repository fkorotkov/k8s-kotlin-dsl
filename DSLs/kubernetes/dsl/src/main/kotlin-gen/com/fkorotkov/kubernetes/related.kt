// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference


fun  model_Event.`related`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`related` == null) {
    this.`related` = model_ObjectReference()
  }

  this.`related`.block()
}

