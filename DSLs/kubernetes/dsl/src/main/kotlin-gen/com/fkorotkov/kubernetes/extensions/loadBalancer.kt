// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.IngressLoadBalancerStatus as extensions_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus


fun  extensions_IngressStatus.`loadBalancer`(block: extensions_IngressLoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = extensions_IngressLoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}

