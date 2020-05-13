// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.FSGroupStrategyOptions as policy_FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec


fun  policy_PodSecurityPolicySpec.`fsGroup`(block: policy_FSGroupStrategyOptions.() -> Unit = {}) {
  if(this.`fsGroup` == null) {
    this.`fsGroup` = policy_FSGroupStrategyOptions()
  }

  this.`fsGroup`.block()
}

