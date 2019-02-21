// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions as extensions_FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec as extensions_PodSecurityPolicySpec


fun  extensions_PodSecurityPolicySpec.`fsGroup`(block: extensions_FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = extensions_FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}

