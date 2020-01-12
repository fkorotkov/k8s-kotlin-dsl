// GENERATED
package com.fkorotkov.kubernetes.discovery

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.discovery.Endpoint as discovery_Endpoint


fun  discovery_Endpoint.`targetRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`targetRef` == null) {
    this.`targetRef` = model_ObjectReference()
  }

  this.`targetRef`.block()
}

