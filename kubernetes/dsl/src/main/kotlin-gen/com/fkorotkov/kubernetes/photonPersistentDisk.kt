// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`photonPersistentDisk`(block: PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`photonPersistentDisk` == null) {
    this.`photonPersistentDisk` = PhotonPersistentDiskVolumeSource()
  }

  this.`photonPersistentDisk`.block()
}


fun  Volume.`photonPersistentDisk`(block: PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`photonPersistentDisk` == null) {
    this.`photonPersistentDisk` = PhotonPersistentDiskVolumeSource()
  }

  this.`photonPersistentDisk`.block()
}

