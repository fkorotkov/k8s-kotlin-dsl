// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus as model_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PodsMetricSource as model_PodsMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricStatus as model_PodsMetricStatus


fun  model_ObjectMetricSource.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}


fun  model_ObjectMetricStatus.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}


fun  model_PersistentVolumeClaimSpec.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}


fun  model_PodsMetricSource.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}


fun  model_PodsMetricStatus.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}

