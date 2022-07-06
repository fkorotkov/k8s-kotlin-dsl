// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity


fun  storage_CSIStorageCapacity.`capacity`(block: model_Quantity.() -> Unit = {}) {
  if(this.`capacity` == null) {
    this.`capacity` = model_Quantity()
  }

  this.`capacity`.block()
}

