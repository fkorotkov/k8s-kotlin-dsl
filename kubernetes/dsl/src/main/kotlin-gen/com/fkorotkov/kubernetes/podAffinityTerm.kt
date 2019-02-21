// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm
import io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm as model_WeightedPodAffinityTerm


fun  model_WeightedPodAffinityTerm.`podAffinityTerm`(block: model_PodAffinityTerm.() -> Unit = {}) {
  if(this.`podAffinityTerm` == null) {
    this.`podAffinityTerm` = model_PodAffinityTerm()
  }

  this.`podAffinityTerm`.block()
}

