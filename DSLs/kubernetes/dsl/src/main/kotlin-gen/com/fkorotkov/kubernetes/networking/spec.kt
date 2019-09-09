// GENERATED
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.networking.NetworkPolicy as networking_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec as networking_NetworkPolicySpec


fun  networking_NetworkPolicy.`spec`(block: networking_NetworkPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = networking_NetworkPolicySpec()
  }

  this.`spec`.block()
}

