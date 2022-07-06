// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity


fun  storage_CSIStorageCapacity.`maximumVolumeSize`(block: model_Quantity.() -> Unit = {}) {
  if(this.`maximumVolumeSize` == null) {
    this.`maximumVolumeSize` = model_Quantity()
  }

  this.`maximumVolumeSize`.block()
}

