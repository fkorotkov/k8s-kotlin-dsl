// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.LoadBalancerStatus as model_LoadBalancerStatus
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus


fun  extensions_IngressStatus.`loadBalancer`(block: model_LoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = model_LoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}

