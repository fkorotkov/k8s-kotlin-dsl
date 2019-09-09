// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.StorageOSPersistentVolumeSource as model_StorageOSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.StorageOSVolumeSource as model_StorageOSVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`storageos`(block: model_StorageOSPersistentVolumeSource.() -> Unit = {}) {
  if(this.`storageos` == null) {
    this.`storageos` = model_StorageOSPersistentVolumeSource()
  }

  this.`storageos`.block()
}


fun  model_Volume.`storageos`(block: model_StorageOSVolumeSource.() -> Unit = {}) {
  if(this.`storageos` == null) {
    this.`storageos` = model_StorageOSVolumeSource()
  }

  this.`storageos`.block()
}

