// GENERATED
package com.fkorotkov.kubernetes.discovery

import io.fabric8.kubernetes.api.model.discovery.Endpoint as discovery_Endpoint
import io.fabric8.kubernetes.api.model.discovery.EndpointConditions as discovery_EndpointConditions


fun  discovery_Endpoint.`conditions`(block: discovery_EndpointConditions.() -> Unit = {}) {
  if(this.`conditions` == null) {
    this.`conditions` = discovery_EndpointConditions()
  }

  this.`conditions`.block()
}

