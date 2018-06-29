// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer


fun  NetworkPolicyPeer.`namespaceSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = LabelSelector()
  }

  this.`namespaceSelector`.block()
}

