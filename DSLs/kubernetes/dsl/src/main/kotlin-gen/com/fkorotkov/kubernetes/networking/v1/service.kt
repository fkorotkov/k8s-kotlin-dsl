// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1.IngressServiceBackend as v1_IngressServiceBackend


fun  v1_IngressBackend.`service`(block: v1_IngressServiceBackend.() -> Unit = {}) {
  if(this.`service` == null) {
    this.`service` = v1_IngressServiceBackend()
  }

  this.`service`.block()
}

