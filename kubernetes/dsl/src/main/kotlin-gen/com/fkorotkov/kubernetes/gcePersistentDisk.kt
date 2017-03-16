// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`gcePersistentDisk`(block: GCEPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`gcePersistentDisk` == null) {
    this.`gcePersistentDisk` = GCEPersistentDiskVolumeSource()
  }

  this.`gcePersistentDisk`.block()
}


fun  Volume.`gcePersistentDisk`(block: GCEPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`gcePersistentDisk` == null) {
    this.`gcePersistentDisk` = GCEPersistentDiskVolumeSource()
  }

  this.`gcePersistentDisk`.block()
}

