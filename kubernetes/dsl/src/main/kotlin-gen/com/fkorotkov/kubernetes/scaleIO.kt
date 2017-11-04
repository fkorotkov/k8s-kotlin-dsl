// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`scaleIO`(block: ScaleIOVolumeSource.() -> Unit = {}) {
  if(this.`scaleIO` == null) {
    this.`scaleIO` = ScaleIOVolumeSource()
  }

  this.`scaleIO`.block()
}


fun  Volume.`scaleIO`(block: ScaleIOVolumeSource.() -> Unit = {}) {
  if(this.`scaleIO` == null) {
    this.`scaleIO` = ScaleIOVolumeSource()
  }

  this.`scaleIO`.block()
}

