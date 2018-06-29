// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment


fun  RollingUpdateDeployment.`maxSurge`(block: IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = IntOrString()
  }

  this.`maxSurge`.block()
}

