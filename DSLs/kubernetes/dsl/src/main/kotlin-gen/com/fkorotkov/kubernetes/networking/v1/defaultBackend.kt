// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1.IngressSpec as v1_IngressSpec


fun  v1_IngressSpec.`defaultBackend`(block: v1_IngressBackend.() -> Unit = {}) {
  if(this.`defaultBackend` == null) {
    this.`defaultBackend` = v1_IngressBackend()
  }

  this.`defaultBackend`.block()
}

