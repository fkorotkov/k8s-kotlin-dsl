// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PortworxVolumeSource as model_PortworxVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`portworxVolume`(block: model_PortworxVolumeSource.() -> Unit = {}) {
  if(this.`portworxVolume` == null) {
    this.`portworxVolume` = model_PortworxVolumeSource()
  }

  this.`portworxVolume`.block()
}


fun  model_Volume.`portworxVolume`(block: model_PortworxVolumeSource.() -> Unit = {}) {
  if(this.`portworxVolume` == null) {
    this.`portworxVolume` = model_PortworxVolumeSource()
  }

  this.`portworxVolume`.block()
}

