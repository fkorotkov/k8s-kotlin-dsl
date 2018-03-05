// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.JobSpec
import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec


fun  DaemonSetSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  DeploymentSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  JobSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  PersistentVolumeClaimSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  PodDisruptionBudgetSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  ReplicaSetSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  StatefulSetSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}

