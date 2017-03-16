// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CinderVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`cinder`(block: CinderVolumeSource.() -> Unit = {}) {
  if(this.`cinder` == null) {
    this.`cinder` = CinderVolumeSource()
  }

  this.`cinder`.block()
}


fun  Volume.`cinder`(block: CinderVolumeSource.() -> Unit = {}) {
  if(this.`cinder` == null) {
    this.`cinder` = CinderVolumeSource()
  }

  this.`cinder`.block()
}

