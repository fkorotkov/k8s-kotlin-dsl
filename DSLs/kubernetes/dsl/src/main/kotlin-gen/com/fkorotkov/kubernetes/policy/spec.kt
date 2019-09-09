// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec as policy_PodDisruptionBudgetSpec


fun  policy_PodDisruptionBudget.`spec`(block: policy_PodDisruptionBudgetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = policy_PodDisruptionBudgetSpec()
  }

  this.`spec`.block()
}

