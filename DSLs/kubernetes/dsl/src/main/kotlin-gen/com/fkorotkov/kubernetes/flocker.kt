// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FlockerVolumeSource as model_FlockerVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`flocker`(block: model_FlockerVolumeSource.() -> Unit = {}) {
  if(this.`flocker` == null) {
    this.`flocker` = model_FlockerVolumeSource()
  }

  this.`flocker`.block()
}


fun  model_Volume.`flocker`(block: model_FlockerVolumeSource.() -> Unit = {}) {
  if(this.`flocker` == null) {
    this.`flocker` = model_FlockerVolumeSource()
  }

  this.`flocker`.block()
}

