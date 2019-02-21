// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.ScaleIOPersistentVolumeSource as model_ScaleIOPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource as model_ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`scaleIO`(block: model_ScaleIOPersistentVolumeSource.() -> Unit = {}) {
  if(this.`scaleIO` == null) {
    this.`scaleIO` = model_ScaleIOPersistentVolumeSource()
  }

  this.`scaleIO`.block()
}


fun  model_Volume.`scaleIO`(block: model_ScaleIOVolumeSource.() -> Unit = {}) {
  if(this.`scaleIO` == null) {
    this.`scaleIO` = model_ScaleIOVolumeSource()
  }

  this.`scaleIO`.block()
}

