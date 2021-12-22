// GENERATED
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec


fun  v1_PodDisruptionBudgetSpec.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}

