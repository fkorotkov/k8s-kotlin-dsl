// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodAffinityTerm
import io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm


fun  WeightedPodAffinityTerm.`podAffinityTerm`(block: PodAffinityTerm.() -> Unit = {}) {
  if(this.`podAffinityTerm` == null) {
    this.`podAffinityTerm` = PodAffinityTerm()
  }

  this.`podAffinityTerm`.block()
}

