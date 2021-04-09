// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressClass as v1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassSpec as v1_IngressClassSpec
import io.fabric8.kubernetes.api.model.networking.v1.IngressSpec as v1_IngressSpec
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicy as v1_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicySpec as v1_NetworkPolicySpec


fun  v1_Ingress.`spec`(block: v1_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_IngressSpec()
  }

  this.`spec`.block()
}


fun  v1_IngressClass.`spec`(block: v1_IngressClassSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_IngressClassSpec()
  }

  this.`spec`.block()
}


fun  v1_NetworkPolicy.`spec`(block: v1_NetworkPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_NetworkPolicySpec()
  }

  this.`spec`.block()
}

