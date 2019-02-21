// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_Container.`readinessProbe`(block: model_Probe.() -> Unit = {}) {
  if(this.`readinessProbe` == null) {
    this.`readinessProbe` = model_Probe()
  }

  this.`readinessProbe`.block()
}

