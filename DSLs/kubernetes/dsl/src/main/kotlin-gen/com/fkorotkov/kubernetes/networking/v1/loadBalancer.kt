// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.LoadBalancerStatus as model_LoadBalancerStatus
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus


fun  v1_IngressStatus.`loadBalancer`(block: model_LoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = model_LoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}

