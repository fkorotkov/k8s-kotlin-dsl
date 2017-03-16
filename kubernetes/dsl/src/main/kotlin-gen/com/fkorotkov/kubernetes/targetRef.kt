// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EndpointAddress
import io.fabric8.kubernetes.api.model.ObjectReference


fun  EndpointAddress.`targetRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`targetRef` == null) {
    this.`targetRef` = ObjectReference()
  }

  this.`targetRef`.block()
}

