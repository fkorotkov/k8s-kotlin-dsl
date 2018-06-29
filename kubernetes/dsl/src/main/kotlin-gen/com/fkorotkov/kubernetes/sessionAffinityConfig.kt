// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec
import io.fabric8.kubernetes.api.model.SessionAffinityConfig


fun  ServiceSpec.`sessionAffinityConfig`(block: SessionAffinityConfig.() -> Unit = {}) {
  if(this.`sessionAffinityConfig` == null) {
    this.`sessionAffinityConfig` = SessionAffinityConfig()
  }

  this.`sessionAffinityConfig`.block()
}

