// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IngressClassParametersReference as v1_IngressClassParametersReference
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassSpec as v1_IngressClassSpec


fun  v1_IngressClassSpec.`parameters`(block: v1_IngressClassParametersReference.() -> Unit = {}) {
  if(this.`parameters` == null) {
    this.`parameters` = v1_IngressClassParametersReference()
  }

  this.`parameters`.block()
}

