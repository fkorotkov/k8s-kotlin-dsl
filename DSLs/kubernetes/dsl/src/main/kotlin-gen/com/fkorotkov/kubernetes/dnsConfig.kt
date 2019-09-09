// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodDNSConfig as model_PodDNSConfig
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec


fun  model_PodSpec.`dnsConfig`(block: model_PodDNSConfig.() -> Unit = {}) {
  if(this.`dnsConfig` == null) {
    this.`dnsConfig` = model_PodDNSConfig()
  }

  this.`dnsConfig`.block()
}

