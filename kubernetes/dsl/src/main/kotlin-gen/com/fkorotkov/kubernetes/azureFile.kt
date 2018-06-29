// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AzureFilePersistentVolumeSource
import io.fabric8.kubernetes.api.model.AzureFileVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`azureFile`(block: AzureFilePersistentVolumeSource.() -> Unit = {}) {
  if(this.`azureFile` == null) {
    this.`azureFile` = AzureFilePersistentVolumeSource()
  }

  this.`azureFile`.block()
}


fun  Volume.`azureFile`(block: AzureFileVolumeSource.() -> Unit = {}) {
  if(this.`azureFile` == null) {
    this.`azureFile` = AzureFileVolumeSource()
  }

  this.`azureFile`.block()
}

