// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec


fun  NetworkPolicyPeer.`podSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = LabelSelector()
  }

  this.`podSelector`.block()
}


fun  NetworkPolicySpec.`podSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`podSelector` == null) {
    this.`podSelector` = LabelSelector()
  }

  this.`podSelector`.block()
}

