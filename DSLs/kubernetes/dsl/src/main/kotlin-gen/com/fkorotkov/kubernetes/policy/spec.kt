// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec as policy_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicy as policy_PodSecurityPolicy
import io.fabric8.kubernetes.api.model.policy.PodSecurityPolicySpec as policy_PodSecurityPolicySpec


fun  policy_PodDisruptionBudget.`spec`(block: policy_PodDisruptionBudgetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = policy_PodDisruptionBudgetSpec()
  }

  this.`spec`.block()
}


fun  policy_PodSecurityPolicy.`spec`(block: policy_PodSecurityPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = policy_PodSecurityPolicySpec()
  }

  this.`spec`.block()
}

