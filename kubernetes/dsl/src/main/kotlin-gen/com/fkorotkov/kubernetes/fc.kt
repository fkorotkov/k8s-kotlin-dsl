// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FCVolumeSource as model_FCVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`fc`(block: model_FCVolumeSource.() -> Unit = {}) {
  if(this.`fc` == null) {
    this.`fc` = model_FCVolumeSource()
  }

  this.`fc`.block()
}


fun  model_Volume.`fc`(block: model_FCVolumeSource.() -> Unit = {}) {
  if(this.`fc` == null) {
    this.`fc` = model_FCVolumeSource()
  }

  this.`fc`.block()
}

