// GENERATED
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIStorageCapacity as v1beta1_CSIStorageCapacity


fun  v1beta1_CSIStorageCapacity.`maximumVolumeSize`(block: model_Quantity.() -> Unit = {}) {
  if(this.`maximumVolumeSize` == null) {
    this.`maximumVolumeSize` = model_Quantity()
  }

  this.`maximumVolumeSize`.block()
}

