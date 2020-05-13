// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.RunAsGroupStrategyOptions as policy_RunAsGroupStrategyOptions


fun  policy_PodSecurityPolicySpec.`runAsGroup`(block: policy_RunAsGroupStrategyOptions.() -> Unit = {}) {
  if(this.`runAsGroup` == null) {
    this.`runAsGroup` = policy_RunAsGroupStrategyOptions()
  }

  this.`runAsGroup`.block()
}

