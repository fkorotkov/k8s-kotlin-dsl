// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.RuntimeClassStrategyOptions as policy_RuntimeClassStrategyOptions


fun  policy_PodSecurityPolicySpec.`runtimeClass`(block: policy_RuntimeClassStrategyOptions.() -> Unit = {}) {
  if(this.`runtimeClass` == null) {
    this.`runtimeClass` = policy_RuntimeClassStrategyOptions()
  }

  this.`runtimeClass`.block()
}

