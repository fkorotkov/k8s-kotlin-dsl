// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec as policy_PodDisruptionBudgetSpec


fun  policy_PodDisruptionBudgetSpec.`minAvailable`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`minAvailable` == null) {
    this.`minAvailable` = model_IntOrString()
  }

  this.`minAvailable`.block()
}

