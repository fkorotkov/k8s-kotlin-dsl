// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec


fun  PersistentVolumeSpec.`csi`(block: CSIPersistentVolumeSource.() -> Unit = {}) {
  if(this.`csi` == null) {
    this.`csi` = CSIPersistentVolumeSource()
  }

  this.`csi`.block()
}

