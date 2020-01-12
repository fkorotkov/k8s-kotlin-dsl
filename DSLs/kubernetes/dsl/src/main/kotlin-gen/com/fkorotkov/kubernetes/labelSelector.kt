// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm
import io.fabric8.kubernetes.api.model.TopologySpreadConstraint as model_TopologySpreadConstraint


fun  model_PodAffinityTerm.`labelSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`labelSelector` == null) {
    this.`labelSelector` = model_LabelSelector()
  }

  this.`labelSelector`.block()
}


fun  model_TopologySpreadConstraint.`labelSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`labelSelector` == null) {
    this.`labelSelector` = model_LabelSelector()
  }

  this.`labelSelector`.block()
}

