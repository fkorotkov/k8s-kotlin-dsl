// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment


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

