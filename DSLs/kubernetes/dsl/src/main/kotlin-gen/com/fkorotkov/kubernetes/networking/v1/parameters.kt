// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassSpec as v1_IngressClassSpec


fun  v1_IngressClassSpec.`parameters`(block: model_TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`parameters` == null) {
    this.`parameters` = model_TypedLocalObjectReference()
  }

  this.`parameters`.block()
}

