// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.MetricIdentifier as model_MetricIdentifier
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec


fun  model_MetricIdentifier.`selector`(block: model_LabelSelector.() -> Unit = {}) {
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

