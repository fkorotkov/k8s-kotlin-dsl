// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.kubernetes.api.model.events.Event


fun  Event.`regarding`(block: ObjectReference.() -> Unit = {}) {
  if(this.`regarding` == null) {
    this.`regarding` = ObjectReference()
  }

  this.`regarding`.block()
}

