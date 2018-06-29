// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.networking.IPBlock
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer


fun  NetworkPolicyPeer.`ipBlock`(block: IPBlock.() -> Unit = {}) {
  if(this.`ipBlock` == null) {
    this.`ipBlock` = IPBlock()
  }

  this.`ipBlock`.block()
}

