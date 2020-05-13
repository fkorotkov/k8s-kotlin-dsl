// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.RunAsUserStrategyOptions as policy_RunAsUserStrategyOptions


fun  policy_PodSecurityPolicySpec.`runAsUser`(block: policy_RunAsUserStrategyOptions.() -> Unit = {}) {
  if(this.`runAsUser` == null) {
    this.`runAsUser` = policy_RunAsUserStrategyOptions()
  }

  this.`runAsUser`.block()
}

