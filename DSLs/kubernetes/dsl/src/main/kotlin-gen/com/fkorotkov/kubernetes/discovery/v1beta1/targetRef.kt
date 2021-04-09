// GENERATED
package com.fkorotkov.kubernetes.discovery.v1beta1

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.discovery.v1beta1.Endpoint as v1beta1_Endpoint


fun  v1beta1_Endpoint.`targetRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`targetRef` == null) {
    this.`targetRef` = model_ObjectReference()
  }

  this.`targetRef`.block()
}

