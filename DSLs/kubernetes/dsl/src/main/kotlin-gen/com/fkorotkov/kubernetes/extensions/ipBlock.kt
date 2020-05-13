// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.IPBlock as extensions_IPBlock
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer as extensions_NetworkPolicyPeer


fun  extensions_NetworkPolicyPeer.`ipBlock`(block: extensions_IPBlock.() -> Unit = {}) {
  if(this.`ipBlock` == null) {
    this.`ipBlock` = extensions_IPBlock()
  }

  this.`ipBlock`.block()
}

