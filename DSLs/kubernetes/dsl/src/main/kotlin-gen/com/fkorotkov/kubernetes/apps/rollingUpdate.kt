// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy as apps_DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy as apps_DeploymentStrategy
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet as apps_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment as apps_RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy as apps_RollingUpdateStatefulSetStrategy
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy as apps_StatefulSetUpdateStrategy


fun  apps_DaemonSetUpdateStrategy.`rollingUpdate`(block: apps_RollingUpdateDaemonSet.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = apps_RollingUpdateDaemonSet()
  }

  this.`rollingUpdate`.block()
}


fun  apps_DeploymentStrategy.`rollingUpdate`(block: apps_RollingUpdateDeployment.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = apps_RollingUpdateDeployment()
  }

  this.`rollingUpdate`.block()
}


fun  apps_StatefulSetUpdateStrategy.`rollingUpdate`(block: apps_RollingUpdateStatefulSetStrategy.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = apps_RollingUpdateStatefulSetStrategy()
  }

  this.`rollingUpdate`.block()
}

