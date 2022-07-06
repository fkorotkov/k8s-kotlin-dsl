// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicy as v1_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyStatus as v1_NetworkPolicyStatus


fun  v1_Ingress.`status`(block: v1_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_IngressStatus()
  }

  this.`status`.block()
}


fun  v1_NetworkPolicy.`status`(block: v1_NetworkPolicyStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_NetworkPolicyStatus()
  }

  this.`status`.block()
}

