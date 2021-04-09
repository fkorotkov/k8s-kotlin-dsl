// GENERATED
package com.fkorotkov.kubernetes.events.v1

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.events.v1.Event as v1_Event


fun  v1_Event.`regarding`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`regarding` == null) {
    this.`regarding` = model_ObjectReference()
  }

  this.`regarding`.block()
}

