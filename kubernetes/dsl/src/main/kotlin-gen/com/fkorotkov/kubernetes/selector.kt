// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PodsMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricStatus
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec
import io.fabric8.kubernetes.api.model.batch.JobSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec


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


fun  ObjectMetricSource.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  ObjectMetricStatus.`selector`(block: LabelSelector.() -> Unit = {}) {
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


fun  PodPresetSpec.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  PodsMetricSource.`selector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = LabelSelector()
  }

  this.`selector`.block()
}


fun  PodsMetricStatus.`selector`(block: LabelSelector.() -> Unit = {}) {
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

