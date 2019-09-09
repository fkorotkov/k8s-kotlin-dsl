// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource as model_GCEPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`gcePersistentDisk`(block: model_GCEPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`gcePersistentDisk` == null) {
    this.`gcePersistentDisk` = model_GCEPersistentDiskVolumeSource()
  }

  this.`gcePersistentDisk`.block()
}


fun  model_Volume.`gcePersistentDisk`(block: model_GCEPersistentDiskVolumeSource.() -> Unit = {}) {
  if(this.`gcePersistentDisk` == null) {
    this.`gcePersistentDisk` = model_GCEPersistentDiskVolumeSource()
  }

  this.`gcePersistentDisk`.block()
}

