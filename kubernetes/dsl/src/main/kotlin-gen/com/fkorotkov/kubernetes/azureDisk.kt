// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`azureDisk`(block: AzureDiskVolumeSource.() -> Unit = {}) {
  if(this.`azureDisk` == null) {
    this.`azureDisk` = AzureDiskVolumeSource()
  }

  this.`azureDisk`.block()
}


fun  Volume.`azureDisk`(block: AzureDiskVolumeSource.() -> Unit = {}) {
  if(this.`azureDisk` == null) {
    this.`azureDisk` = AzureDiskVolumeSource()
  }

  this.`azureDisk`.block()
}

