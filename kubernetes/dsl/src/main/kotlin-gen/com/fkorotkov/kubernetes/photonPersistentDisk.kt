// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource as model_PhotonPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`photonPersistentDisk`(block: model_PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`photonPersistentDisk` == null) {
    this.`photonPersistentDisk` = model_PhotonPersistentDiskVolumeSource()
  }

  this.`photonPersistentDisk`.block()
}


fun  model_Volume.`photonPersistentDisk`(block: model_PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`photonPersistentDisk` == null) {
    this.`photonPersistentDisk` = model_PhotonPersistentDiskVolumeSource()
  }

  this.`photonPersistentDisk`.block()
}

