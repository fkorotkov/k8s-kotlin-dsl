// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`rbd`(block: RBDVolumeSource.() -> Unit = {}) {
  if(this.`rbd` == null) {
    this.`rbd` = RBDVolumeSource()
  }

  this.`rbd`.block()
}


fun  Volume.`rbd`(block: RBDVolumeSource.() -> Unit = {}) {
  if(this.`rbd` == null) {
    this.`rbd` = RBDVolumeSource()
  }

  this.`rbd`.block()
}

