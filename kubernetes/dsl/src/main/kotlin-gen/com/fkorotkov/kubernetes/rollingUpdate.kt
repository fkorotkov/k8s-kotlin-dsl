// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apps.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy
import io.fabric8.kubernetes.api.model.apps.StatefulSetUpdateStrategy


fun  DaemonSetUpdateStrategy.`rollingUpdate`(block: RollingUpdateDaemonSet.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = RollingUpdateDaemonSet()
  }

  this.`rollingUpdate`.block()
}


fun  DeploymentStrategy.`rollingUpdate`(block: RollingUpdateDeployment.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = RollingUpdateDeployment()
  }

  this.`rollingUpdate`.block()
}


fun  StatefulSetUpdateStrategy.`rollingUpdate`(block: RollingUpdateStatefulSetStrategy.() -> Unit = {}) {
  if(this.`rollingUpdate` == null) {
    this.`rollingUpdate` = RollingUpdateStatefulSetStrategy()
  }

  this.`rollingUpdate`.block()
}

