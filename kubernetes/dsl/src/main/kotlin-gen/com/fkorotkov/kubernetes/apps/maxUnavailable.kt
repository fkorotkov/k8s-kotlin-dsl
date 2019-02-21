// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet as apps_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment as apps_RollingUpdateDeployment


fun  apps_RollingUpdateDaemonSet.`maxUnavailable`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = model_IntOrString()
  }

  this.`maxUnavailable`.block()
}


fun  apps_RollingUpdateDeployment.`maxUnavailable`(block: model_IntOrString.() -> Unit = {}) {
  if(this.`maxUnavailable` == null) {
    this.`maxUnavailable` = model_IntOrString()
  }

  this.`maxUnavailable`.block()
}

