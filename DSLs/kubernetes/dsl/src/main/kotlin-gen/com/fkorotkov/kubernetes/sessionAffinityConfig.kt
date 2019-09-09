// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec as model_ServiceSpec
import io.fabric8.kubernetes.api.model.SessionAffinityConfig as model_SessionAffinityConfig


fun  model_ServiceSpec.`sessionAffinityConfig`(block: model_SessionAffinityConfig.() -> Unit = {}) {
  if(this.`sessionAffinityConfig` == null) {
    this.`sessionAffinityConfig` = model_SessionAffinityConfig()
  }

  this.`sessionAffinityConfig`.block()
}

