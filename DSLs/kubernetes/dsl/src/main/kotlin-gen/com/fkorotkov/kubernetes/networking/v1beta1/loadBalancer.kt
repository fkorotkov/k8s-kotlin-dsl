// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressLoadBalancerStatus as v1beta1_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressStatus as v1beta1_IngressStatus


fun  v1beta1_IngressStatus.`loadBalancer`(block: v1beta1_IngressLoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = v1beta1_IngressLoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}

