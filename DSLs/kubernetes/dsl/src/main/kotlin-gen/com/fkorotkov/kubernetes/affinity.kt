// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec


fun  model_PodSpec.`affinity`(block: model_Affinity.() -> Unit = {}) {
  if(this.`affinity` == null) {
    this.`affinity` = model_Affinity()
  }

  this.`affinity`.block()
}

