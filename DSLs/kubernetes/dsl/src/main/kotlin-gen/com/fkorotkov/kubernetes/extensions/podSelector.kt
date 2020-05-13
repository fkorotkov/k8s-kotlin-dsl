// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer as extensions_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec as extensions_NetworkPolicySpec


fun  extensions_NetworkPolicyPeer.`podSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = model_LabelSelector()
  }

  this.`podSelector`.block()
}


fun  extensions_NetworkPolicySpec.`podSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = model_LabelSelector()
  }

  this.`podSelector`.block()
}

