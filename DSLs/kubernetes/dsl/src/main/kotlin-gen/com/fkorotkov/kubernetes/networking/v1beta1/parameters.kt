// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassParametersReference as v1beta1_IngressClassParametersReference
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassSpec as v1beta1_IngressClassSpec


fun  v1beta1_IngressClassSpec.`parameters`(block: v1beta1_IngressClassParametersReference.() -> Unit = {}) {
  if(this.`parameters` == null) {
    this.`parameters` = v1beta1_IngressClassParametersReference()
  }

  this.`parameters`.block()
}

