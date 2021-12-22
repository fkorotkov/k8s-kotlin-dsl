// GENERATED
package com.fkorotkov.kubernetes.discovery.v1

import io.fabric8.kubernetes.api.model.discovery.v1.Endpoint as v1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointConditions as v1_EndpointConditions


fun  v1_Endpoint.`conditions`(block: v1_EndpointConditions.() -> Unit = {}) {
  if(this.`conditions` == null) {
    this.`conditions` = v1_EndpointConditions()
  }

  this.`conditions`.block()
}

