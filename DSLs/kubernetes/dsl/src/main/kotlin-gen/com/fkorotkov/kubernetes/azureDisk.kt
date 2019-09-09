// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource as model_AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`azureDisk`(block: model_AzureDiskVolumeSource.() -> Unit = {}) {
  if(this.`azureDisk` == null) {
    this.`azureDisk` = model_AzureDiskVolumeSource()
  }

  this.`azureDisk`.block()
}


fun  model_Volume.`azureDisk`(block: model_AzureDiskVolumeSource.() -> Unit = {}) {
  if(this.`azureDisk` == null) {
    this.`azureDisk` = model_AzureDiskVolumeSource()
  }

  this.`azureDisk`.block()
}

