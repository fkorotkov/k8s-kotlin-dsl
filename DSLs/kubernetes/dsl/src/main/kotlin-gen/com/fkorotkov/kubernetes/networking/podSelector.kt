// GENERATED
package com.fkorotkov.kubernetes.networking

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyPeer as networking_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.networking.NetworkPolicySpec as networking_NetworkPolicySpec


fun  networking_NetworkPolicyPeer.`podSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = model_LabelSelector()
  }

  this.`podSelector`.block()
}


fun  networking_NetworkPolicySpec.`podSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = model_LabelSelector()
  }

  this.`podSelector`.block()
}

