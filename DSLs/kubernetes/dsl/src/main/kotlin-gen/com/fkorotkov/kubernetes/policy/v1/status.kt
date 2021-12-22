// GENERATED
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudget as v1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetStatus as v1_PodDisruptionBudgetStatus


fun  v1_PodDisruptionBudget.`status`(block: v1_PodDisruptionBudgetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_PodDisruptionBudgetStatus()
  }

  this.`status`.block()
}

