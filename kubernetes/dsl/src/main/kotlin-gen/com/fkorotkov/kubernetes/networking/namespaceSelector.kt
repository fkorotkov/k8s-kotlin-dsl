// GENERATED
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer as networking_NetworkPolicyPeer


fun  networking_NetworkPolicyPeer.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}

