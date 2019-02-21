// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodAffinity as model_PodAffinity


fun  model_Affinity.`podAffinity`(block: model_PodAffinity.() -> Unit = {}) {
  if(this.`podAffinity` == null) {
    this.`podAffinity` = model_PodAffinity()
  }

  this.`podAffinity`.block()
}

