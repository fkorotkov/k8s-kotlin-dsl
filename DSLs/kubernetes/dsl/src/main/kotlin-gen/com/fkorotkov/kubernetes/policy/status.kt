// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus as policy_PodDisruptionBudgetStatus


fun  policy_PodDisruptionBudget.`status`(block: policy_PodDisruptionBudgetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = policy_PodDisruptionBudgetStatus()
  }

  this.`status`.block()
}

