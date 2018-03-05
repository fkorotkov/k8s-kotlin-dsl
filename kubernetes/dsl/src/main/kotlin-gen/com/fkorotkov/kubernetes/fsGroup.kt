// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec


fun  PodSecurityPolicySpec.`fsGroup`(block: FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}

