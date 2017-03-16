// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DaemonEndpoint
import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints


fun  NodeDaemonEndpoints.`kubeletEndpoint`(block: DaemonEndpoint.() -> Unit = {}) {
  if(this.`kubeletEndpoint` == null) {
    this.`kubeletEndpoint` = DaemonEndpoint()
  }

  this.`kubeletEndpoint`.block()
}

