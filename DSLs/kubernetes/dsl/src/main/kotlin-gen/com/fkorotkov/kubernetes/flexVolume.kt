// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FlexPersistentVolumeSource as model_FlexPersistentVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource as model_FlexVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`flexVolume`(block: model_FlexPersistentVolumeSource.() -> Unit = {}) {
  if(this.`flexVolume` == null) {
    this.`flexVolume` = model_FlexPersistentVolumeSource()
  }

  this.`flexVolume`.block()
}


fun  model_Volume.`flexVolume`(block: model_FlexVolumeSource.() -> Unit = {}) {
  if(this.`flexVolume` == null) {
    this.`flexVolume` = model_FlexVolumeSource()
  }

  this.`flexVolume`.block()
}

