// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.RunAsGroupStrategyOptions as extensions_RunAsGroupStrategyOptions


fun  extensions_PodSecurityPolicySpec.`runAsGroup`(block: extensions_RunAsGroupStrategyOptions.() -> Unit = {}) {
  if(this.`runAsGroup` == null) {
    this.`runAsGroup` = extensions_RunAsGroupStrategyOptions()
  }

  this.`runAsGroup`.block()
}

