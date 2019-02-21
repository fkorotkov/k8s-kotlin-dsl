// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AzureFilePersistentVolumeSource as model_AzureFilePersistentVolumeSource
import io.fabric8.kubernetes.api.model.AzureFileVolumeSource as model_AzureFileVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`azureFile`(block: model_AzureFilePersistentVolumeSource.() -> Unit = {}) {
  if(this.`azureFile` == null) {
    this.`azureFile` = model_AzureFilePersistentVolumeSource()
  }

  this.`azureFile`.block()
}


fun  model_Volume.`azureFile`(block: model_AzureFileVolumeSource.() -> Unit = {}) {
  if(this.`azureFile` == null) {
    this.`azureFile` = model_AzureFileVolumeSource()
  }

  this.`azureFile`.block()
}

