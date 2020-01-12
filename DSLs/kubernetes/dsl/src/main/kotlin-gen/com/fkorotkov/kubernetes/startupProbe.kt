// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.Probe as model_Probe


fun  model_Container.`startupProbe`(block: model_Probe.() -> Unit = {}) {
  if(this.`startupProbe` == null) {
    this.`startupProbe` = model_Probe()
  }

  this.`startupProbe`.block()
}


fun  model_EphemeralContainer.`startupProbe`(block: model_Probe.() -> Unit = {}) {
  if(this.`startupProbe` == null) {
    this.`startupProbe` = model_Probe()
  }

  this.`startupProbe`.block()
}

