// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodDNSConfig
import io.fabric8.kubernetes.api.model.PodSpec


fun  PodSpec.`dnsConfig`(block: PodDNSConfig.() -> Unit = {}) {
  if(this.`dnsConfig` == null) {
    this.`dnsConfig` = PodDNSConfig()
  }

  this.`dnsConfig`.block()
}

