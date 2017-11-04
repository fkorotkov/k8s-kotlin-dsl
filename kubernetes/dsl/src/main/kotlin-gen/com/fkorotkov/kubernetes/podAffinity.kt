// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.PodAffinity


fun  Affinity.`podAffinity`(block: PodAffinity.() -> Unit = {}) {
  if(this.`podAffinity` == null) {
    this.`podAffinity` = PodAffinity()
  }

  this.`podAffinity`.block()
}

