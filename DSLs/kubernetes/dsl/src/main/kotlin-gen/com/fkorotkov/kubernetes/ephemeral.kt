// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EphemeralVolumeSource as model_EphemeralVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_Volume.`ephemeral`(block: model_EphemeralVolumeSource.() -> Unit = {}) {
  if(this.`ephemeral` == null) {
    this.`ephemeral` = model_EphemeralVolumeSource()
  }

  this.`ephemeral`.block()
}

