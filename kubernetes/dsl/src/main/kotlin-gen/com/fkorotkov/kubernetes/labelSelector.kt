// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.PodAffinityTerm


fun  PodAffinityTerm.`labelSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`labelSelector` == null) {
    this.`labelSelector` = LabelSelector()
  }

  this.`labelSelector`.block()
}

