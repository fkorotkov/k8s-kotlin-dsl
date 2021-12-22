// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment


fun  extensions_RollingUpdateDaemonSet.`maxSurge`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = model_IntOrString()
  }

  this.`maxSurge`.block()
}


fun  extensions_RollingUpdateDeployment.`maxSurge`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = model_IntOrString()
  }

  this.`maxSurge`.block()
}

