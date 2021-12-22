// GENERATED
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIStorageCapacity as v1beta1_CSIStorageCapacity


fun  v1beta1_CSIStorageCapacity.`nodeTopology`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`nodeTopology` == null) {
    this.`nodeTopology` = model_LabelSelector()
  }

  this.`nodeTopology`.block()
}

