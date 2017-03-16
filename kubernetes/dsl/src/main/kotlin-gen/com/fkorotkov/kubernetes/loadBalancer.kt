// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LoadBalancerStatus
import io.fabric8.kubernetes.api.model.ServiceStatus
import io.fabric8.kubernetes.api.model.extensions.IngressStatus


fun  IngressStatus.`loadBalancer`(block: LoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = LoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}


fun  ServiceStatus.`loadBalancer`(block: LoadBalancerStatus.() -> Unit = {}) {
  if(this.`loadBalancer` == null) {
    this.`loadBalancer` = LoadBalancerStatus()
  }

  this.`loadBalancer`.block()
}

