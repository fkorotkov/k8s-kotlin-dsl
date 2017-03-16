// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.Probe


fun  Container.`readinessProbe`(block: Probe.() -> Unit = {}) {
  if(this.`readinessProbe` == null) {
    this.`readinessProbe` = Probe()
  }

  this.`readinessProbe`.block()
}

