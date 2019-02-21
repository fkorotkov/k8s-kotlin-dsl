// GENERATED
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPort as networking_NetworkPolicyPort


fun  networking_NetworkPolicyPort.`port`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`port` == null) {
    this.`port` = model_IntOrString()
  }

  this.`port`.block()
}

