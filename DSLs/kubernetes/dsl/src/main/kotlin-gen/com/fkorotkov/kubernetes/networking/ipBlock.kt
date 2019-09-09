// GENERATED
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.networking.IPBlock as networking_IPBlock
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer as networking_NetworkPolicyPeer


fun  networking_NetworkPolicyPeer.`ipBlock`(block: networking_IPBlock.() -> Unit = {}) {
  if(this.`ipBlock` == null) {
    this.`ipBlock` = networking_IPBlock()
  }

  this.`ipBlock`.block()
}

