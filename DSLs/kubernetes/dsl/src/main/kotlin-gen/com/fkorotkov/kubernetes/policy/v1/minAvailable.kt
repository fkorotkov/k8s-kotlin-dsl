// GENERATED
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec


fun  v1_PodDisruptionBudgetSpec.`minAvailable`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`minAvailable` == null) {
    this.`minAvailable` = model_IntOrString()
  }

  this.`minAvailable`.block()
}

