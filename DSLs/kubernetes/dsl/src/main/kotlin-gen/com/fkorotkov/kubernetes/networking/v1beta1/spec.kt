// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress as v1beta1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressSpec as v1beta1_IngressSpec


fun  v1beta1_Ingress.`spec`(block: v1beta1_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_IngressSpec()
  }

  this.`spec`.block()
}

