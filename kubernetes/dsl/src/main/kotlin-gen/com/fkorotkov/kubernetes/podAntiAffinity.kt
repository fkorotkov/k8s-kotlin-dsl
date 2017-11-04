// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.PodAntiAffinity


fun  Affinity.`podAntiAffinity`(block: PodAntiAffinity.() -> Unit = {}) {
  if(this.`podAntiAffinity` == null) {
    this.`podAntiAffinity` = PodAntiAffinity()
  }

  this.`podAntiAffinity`.block()
}

