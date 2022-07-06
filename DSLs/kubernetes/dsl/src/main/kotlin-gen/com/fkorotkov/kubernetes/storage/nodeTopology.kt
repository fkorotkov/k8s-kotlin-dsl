// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity


fun  storage_CSIStorageCapacity.`nodeTopology`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`nodeTopology` == null) {
    this.`nodeTopology` = model_LabelSelector()
  }

  this.`nodeTopology`.block()
}

