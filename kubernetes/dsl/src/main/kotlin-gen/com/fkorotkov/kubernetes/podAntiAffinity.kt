// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodAntiAffinity as model_PodAntiAffinity


fun  model_Affinity.`podAntiAffinity`(block: model_PodAntiAffinity.() -> Unit = {}) {
  if(this.`podAntiAffinity` == null) {
    this.`podAntiAffinity` = model_PodAntiAffinity()
  }

  this.`podAntiAffinity`.block()
}

