// GENERATED
package com.fkorotkov.kubernetes.discovery.v1beta1

import io.fabric8.kubernetes.api.model.discovery.v1beta1.Endpoint as v1beta1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointHints as v1beta1_EndpointHints


fun  v1beta1_Endpoint.`hints`(block: v1beta1_EndpointHints.() -> Unit = {}) {
  if(this.`hints` == null) {
    this.`hints` = v1beta1_EndpointHints()
  }

  this.`hints`.block()
}

