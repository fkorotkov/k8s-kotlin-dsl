// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress as v1beta1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass as v1beta1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassSpec as v1beta1_IngressClassSpec
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressSpec as v1beta1_IngressSpec


fun  v1beta1_Ingress.`spec`(block: v1beta1_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_IngressSpec()
  }

  this.`spec`.block()
}


fun  v1beta1_IngressClass.`spec`(block: v1beta1_IngressClassSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_IngressClassSpec()
  }

  this.`spec`.block()
}

