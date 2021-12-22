// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.CSINodeDriver as storage_CSINodeDriver
import io.fabric8.kubernetes.api.model.storage.VolumeNodeResources as storage_VolumeNodeResources


fun  storage_CSINodeDriver.`allocatable`(block: storage_VolumeNodeResources.() -> Unit = {}) {
  if(this.`allocatable` == null) {
    this.`allocatable` = storage_VolumeNodeResources()
  }

  this.`allocatable`.block()
}

