// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IPBlock as v1_IPBlock
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPeer as v1_NetworkPolicyPeer


fun  v1_NetworkPolicyPeer.`ipBlock`(block: v1_IPBlock.() -> Unit = {}) {
  if(this.`ipBlock` == null) {
    this.`ipBlock` = v1_IPBlock()
  }

  this.`ipBlock`.block()
}

