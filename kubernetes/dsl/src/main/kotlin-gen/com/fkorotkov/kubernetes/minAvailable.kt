// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec


fun  PodDisruptionBudgetSpec.`minAvailable`(block: IntOrString.() -> Unit = {}) {
  if(this.`minAvailable` == null) {
    this.`minAvailable` = IntOrString()
  }

  this.`minAvailable`.block()
}

