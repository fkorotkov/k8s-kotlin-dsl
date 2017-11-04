// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateStatefulSetStrategy
import io.fabric8.kubernetes.api.model.extensions.StatefulSetUpdateStrategy


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

