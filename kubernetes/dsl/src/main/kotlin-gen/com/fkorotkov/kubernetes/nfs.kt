// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NFSVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`nfs`(block: NFSVolumeSource.() -> Unit = {}) {
  if(this.`nfs` == null) {
    this.`nfs` = NFSVolumeSource()
  }

  this.`nfs`.block()
}


fun  Volume.`nfs`(block: NFSVolumeSource.() -> Unit = {}) {
  if(this.`nfs` == null) {
    this.`nfs` = NFSVolumeSource()
  }

  this.`nfs`.block()
}

