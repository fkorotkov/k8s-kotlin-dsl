// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.PodSpec


fun  PodSpec.`affinity`(block: Affinity.() -> Unit = {}) {
  if(this.`affinity` == null) {
    this.`affinity` = Affinity()
  }

  this.`affinity`.block()
}

