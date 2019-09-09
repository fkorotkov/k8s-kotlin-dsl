// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CSIVolumeSource as model_CSIVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`csi`(block: model_CSIPersistentVolumeSource.() -> Unit = {}) {
  if(this.`csi` == null) {
    this.`csi` = model_CSIPersistentVolumeSource()
  }

  this.`csi`.block()
}


fun  model_Volume.`csi`(block: model_CSIVolumeSource.() -> Unit = {}) {
  if(this.`csi` == null) {
    this.`csi` = model_CSIVolumeSource()
  }

  this.`csi`.block()
}

