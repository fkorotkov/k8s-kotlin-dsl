// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec


fun  model_PersistentVolumeSpec.`csi`(block: model_CSIPersistentVolumeSource.() -> Unit = {}) {
  if(this.`csi` == null) {
    this.`csi` = model_CSIPersistentVolumeSource()
  }

  this.`csi`.block()
}

