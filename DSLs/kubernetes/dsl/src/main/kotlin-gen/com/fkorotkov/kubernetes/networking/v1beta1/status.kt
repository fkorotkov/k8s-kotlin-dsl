// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress as v1beta1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressStatus as v1beta1_IngressStatus


fun  v1beta1_Ingress.`status`(block: v1beta1_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1beta1_IngressStatus()
  }

  this.`status`.block()
}

