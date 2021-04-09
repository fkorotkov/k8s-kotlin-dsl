// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassSpec as v1beta1_IngressClassSpec


fun  v1beta1_IngressClassSpec.`parameters`(block: model_TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`parameters` == null) {
    this.`parameters` = model_TypedLocalObjectReference()
  }

  this.`parameters`.block()
}

