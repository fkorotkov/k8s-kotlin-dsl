// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptions


fun  PodSecurityPolicySpec.`runAsGroup`(block: RunAsGroupStrategyOptions.() -> Unit = {}) {
  if(this.`runAsGroup` == null) {
    this.`runAsGroup` = RunAsGroupStrategyOptions()
  }

  this.`runAsGroup`.block()
}

