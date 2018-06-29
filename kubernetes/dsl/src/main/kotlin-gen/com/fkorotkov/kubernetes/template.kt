// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec
import io.fabric8.kubernetes.api.model.batch.JobSpec


fun  DaemonSetSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  DeploymentSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  JobSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  PodTemplate.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  ReplicaSetSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  ReplicationControllerSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}


fun  StatefulSetSpec.`template`(block: PodTemplateSpec.() -> Unit = {}) {
  if(this.`template` == null) {
    this.`template` = PodTemplateSpec()
  }

  this.`template`.block()
}

