// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.RBDPersistentVolumeSource as model_RBDPersistentVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource as model_RBDVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`rbd`(block: model_RBDPersistentVolumeSource.() -> Unit = {}) {
  if(this.`rbd` == null) {
    this.`rbd` = model_RBDPersistentVolumeSource()
  }

  this.`rbd`.block()
}


fun  model_Volume.`rbd`(block: model_RBDVolumeSource.() -> Unit = {}) {
  if(this.`rbd` == null) {
    this.`rbd` = model_RBDVolumeSource()
  }

  this.`rbd`.block()
}

