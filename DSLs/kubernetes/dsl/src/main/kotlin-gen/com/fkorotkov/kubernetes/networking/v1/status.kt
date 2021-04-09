// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus


fun  v1_Ingress.`status`(block: v1_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_IngressStatus()
  }

  this.`status`.block()
}

