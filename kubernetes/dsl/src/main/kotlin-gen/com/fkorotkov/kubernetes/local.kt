// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LocalVolumeSource as model_LocalVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec


fun  model_PersistentVolumeSpec.`local`(block: model_LocalVolumeSource.() -> Unit = {}) {
  if(this.`local` == null) {
    this.`local` = model_LocalVolumeSource()
  }

  this.`local`.block()
}

