// GENERATED
package com.fkorotkov.kubernetes.discovery.v1beta1

import io.fabric8.kubernetes.api.model.discovery.v1beta1.Endpoint as v1beta1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointConditions as v1beta1_EndpointConditions


fun  v1beta1_Endpoint.`conditions`(block: v1beta1_EndpointConditions.() -> Unit = {}) {
  if(this.`conditions` == null) {
    this.`conditions` = v1beta1_EndpointConditions()
  }

  this.`conditions`.block()
}

