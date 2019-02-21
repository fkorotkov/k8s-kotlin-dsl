// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSet as apps_DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec as apps_DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.Deployment as apps_Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSet as apps_ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec as apps_ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSet as apps_StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec


fun  apps_DaemonSet.`spec`(block: apps_DaemonSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = apps_DaemonSetSpec()
  }

  this.`spec`.block()
}


fun  apps_Deployment.`spec`(block: apps_DeploymentSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = apps_DeploymentSpec()
  }

  this.`spec`.block()
}


fun  apps_ReplicaSet.`spec`(block: apps_ReplicaSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = apps_ReplicaSetSpec()
  }

  this.`spec`.block()
}


fun  apps_StatefulSet.`spec`(block: apps_StatefulSetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = apps_StatefulSetSpec()
  }

  this.`spec`.block()
}

