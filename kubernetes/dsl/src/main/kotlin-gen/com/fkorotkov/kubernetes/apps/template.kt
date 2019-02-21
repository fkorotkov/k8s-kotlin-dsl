// GENERATED
package com.fkorotkov.kubernetes.apps

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec as apps_DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec as apps_ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec


fun  apps_DaemonSetSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  apps_DeploymentSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  apps_ReplicaSetSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}


fun  apps_StatefulSetSpec.`template`(block: model_PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = model_PodTemplateSpec()
  }

  this.`template`.block()
}

