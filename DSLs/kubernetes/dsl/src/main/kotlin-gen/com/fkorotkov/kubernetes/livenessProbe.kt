// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_Container.`livenessProbe`(block: model_Probe.() -> Unit = {}) {
  if(this.`livenessProbe` == null) {
    this.`livenessProbe` = model_Probe()
  }

  this.`livenessProbe`.block()
}

