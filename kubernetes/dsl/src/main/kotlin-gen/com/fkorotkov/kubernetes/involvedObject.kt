// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.ObjectReference


fun  Event.`involvedObject`(block: ObjectReference.() -> Unit = {}) {
  if(this.`involvedObject` == null) {
    this.`involvedObject` = ObjectReference()
  }

  this.`involvedObject`.block()
}

