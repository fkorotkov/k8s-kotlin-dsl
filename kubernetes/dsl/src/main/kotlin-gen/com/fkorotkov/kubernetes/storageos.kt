// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`storageos`(block: StorageOSPersistentVolumeSource.() -> Unit = {}) {
  if(this.`storageos` == null) {
    this.`storageos` = StorageOSPersistentVolumeSource()
  }

  this.`storageos`.block()
}


fun  Volume.`storageos`(block: StorageOSVolumeSource.() -> Unit = {}) {
  if(this.`storageos` == null) {
    this.`storageos` = StorageOSVolumeSource()
  }

  this.`storageos`.block()
}

