// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSet as apps_DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus as apps_DaemonSetStatus
import io.fabric8.kubernetes.api.model.apps.Deployment as apps_Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus as apps_DeploymentStatus
import io.fabric8.kubernetes.api.model.apps.ReplicaSet as apps_ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus as apps_ReplicaSetStatus
import io.fabric8.kubernetes.api.model.apps.StatefulSet as apps_StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus as apps_StatefulSetStatus


fun  apps_DaemonSet.`status`(block: apps_DaemonSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apps_DaemonSetStatus()
  }

  this.`status`.block()
}


fun  apps_Deployment.`status`(block: apps_DeploymentStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apps_DeploymentStatus()
  }

  this.`status`.block()
}


fun  apps_ReplicaSet.`status`(block: apps_ReplicaSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apps_ReplicaSetStatus()
  }

  this.`status`.block()
}


fun  apps_StatefulSet.`status`(block: apps_StatefulSetStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = apps_StatefulSetStatus()
  }

  this.`status`.block()
}

