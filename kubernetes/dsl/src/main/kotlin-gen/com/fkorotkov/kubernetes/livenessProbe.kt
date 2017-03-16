// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.Probe


fun  Container.`livenessProbe`(block: Probe.() -> Unit = {}) {
  if(this.`livenessProbe` == null) {
    this.`livenessProbe` = Probe()
  }

  this.`livenessProbe`.block()
}

