// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`persistentVolumeClaim`(block: PersistentVolumeClaimVolumeSource.() -> Unit = {}) {
  if(this.`persistentVolumeClaim` == null) {
    this.`persistentVolumeClaim` = PersistentVolumeClaimVolumeSource()
  }

  this.`persistentVolumeClaim`.block()
}

