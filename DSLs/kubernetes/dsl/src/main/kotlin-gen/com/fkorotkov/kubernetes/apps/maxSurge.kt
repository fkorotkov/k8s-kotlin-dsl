// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet as apps_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment as apps_RollingUpdateDeployment


fun  apps_RollingUpdateDaemonSet.`maxSurge`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = model_IntOrString()
  }

  this.`maxSurge`.block()
}


fun  apps_RollingUpdateDeployment.`maxSurge`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxSurge` == null) {
    this.`maxSurge` = model_IntOrString()
  }

  this.`maxSurge`.block()
}

