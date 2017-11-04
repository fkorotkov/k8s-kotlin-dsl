// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Quantity


fun  EmptyDirVolumeSource.`sizeLimit`(block: Quantity.() -> Unit = {}) {
  if(this.`sizeLimit` == null) {
    this.`sizeLimit` = Quantity()
  }

  this.`sizeLimit`.block()
}

