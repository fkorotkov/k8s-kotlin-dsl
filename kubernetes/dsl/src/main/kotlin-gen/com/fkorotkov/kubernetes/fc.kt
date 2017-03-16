// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FCVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`fc`(block: FCVolumeSource.() -> Unit = {}) {
  if(this.`fc` == null) {
    this.`fc` = FCVolumeSource()
  }

  this.`fc`.block()
}


fun  Volume.`fc`(block: FCVolumeSource.() -> Unit = {}) {
  if(this.`fc` == null) {
    this.`fc` = FCVolumeSource()
  }

  this.`fc`.block()
}

