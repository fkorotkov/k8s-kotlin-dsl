// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPeer as v1_NetworkPolicyPeer


fun  v1_NetworkPolicyPeer.`namespaceSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`namespaceSelector` == null) {
    this.`namespaceSelector` = model_LabelSelector()
  }

  this.`namespaceSelector`.block()
}

