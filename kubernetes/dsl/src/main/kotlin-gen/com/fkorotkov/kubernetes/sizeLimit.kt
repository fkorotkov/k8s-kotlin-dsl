// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource as model_EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity


fun  model_EmptyDirVolumeSource.`sizeLimit`(block: model_Quantity.() -> Unit = {}) {
  if(this.`sizeLimit` == null) {
    this.`sizeLimit` = model_Quantity()
  }

  this.`sizeLimit`.block()
}

