// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PortworxVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`portworxVolume`(block: PortworxVolumeSource.() -> Unit = {}) {
  if(this.`portworxVolume` == null) {
    this.`portworxVolume` = PortworxVolumeSource()
  }

  this.`portworxVolume`.block()
}


fun  Volume.`portworxVolume`(block: PortworxVolumeSource.() -> Unit = {}) {
  if(this.`portworxVolume` == null) {
    this.`portworxVolume` = PortworxVolumeSource()
  }

  this.`portworxVolume`.block()
}

