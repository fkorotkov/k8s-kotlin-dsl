// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec


fun  PodDisruptionBudgetSpec.`maxUnavailable`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = IntOrString()
  }

  this.`maxUnavailable`.block()
}


fun  RollingUpdateDaemonSet.`maxUnavailable`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = IntOrString()
  }

  this.`maxUnavailable`.block()
}


fun  RollingUpdateDeployment.`maxUnavailable`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = IntOrString()
  }

  this.`maxUnavailable`.block()
}

