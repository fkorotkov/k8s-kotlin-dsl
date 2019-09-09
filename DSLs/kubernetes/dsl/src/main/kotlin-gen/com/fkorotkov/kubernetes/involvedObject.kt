// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference


fun  model_Event.`involvedObject`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`involvedObject` == null) {
    this.`involvedObject` = model_ObjectReference()
  }

  this.`involvedObject`.block()
}

