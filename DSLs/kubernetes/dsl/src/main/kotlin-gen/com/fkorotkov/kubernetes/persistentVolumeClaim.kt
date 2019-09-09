// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource as model_PersistentVolumeClaimVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_Volume.`persistentVolumeClaim`(block: model_PersistentVolumeClaimVolumeSource.() -> Unit = {}) {
  if(this.`persistentVolumeClaim` == null) {
    this.`persistentVolumeClaim` = model_PersistentVolumeClaimVolumeSource()
  }

  this.`persistentVolumeClaim`.block()
}

