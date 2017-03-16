// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FlockerVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`flocker`(block: FlockerVolumeSource.() -> Unit = {}) {
  if(this.`flocker` == null) {
    this.`flocker` = FlockerVolumeSource()
  }

  this.`flocker`.block()
}


fun  Volume.`flocker`(block: FlockerVolumeSource.() -> Unit = {}) {
  if(this.`flocker` == null) {
    this.`flocker` = FlockerVolumeSource()
  }

  this.`flocker`.block()
}

