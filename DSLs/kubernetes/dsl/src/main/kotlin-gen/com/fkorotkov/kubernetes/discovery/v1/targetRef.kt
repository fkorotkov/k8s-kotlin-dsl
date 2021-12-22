// GENERATED
package com.fkorotkov.kubernetes.discovery.v1

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.discovery.v1.Endpoint as v1_Endpoint


fun  v1_Endpoint.`targetRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`targetRef` == null) {
    this.`targetRef` = model_ObjectReference()
  }

  this.`targetRef`.block()
}

