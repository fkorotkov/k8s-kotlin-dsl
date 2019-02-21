// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EndpointAddress as model_EndpointAddress
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference


fun  model_EndpointAddress.`targetRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`targetRef` == null) {
    this.`targetRef` = model_ObjectReference()
  }

  this.`targetRef`.block()
}

