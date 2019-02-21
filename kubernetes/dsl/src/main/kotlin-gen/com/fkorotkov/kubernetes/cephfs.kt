// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource as model_CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource as model_CephFSVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`cephfs`(block: model_CephFSPersistentVolumeSource.() -> Unit = {}) {
  if(this.`cephfs` == null) {
    this.`cephfs` = model_CephFSPersistentVolumeSource()
  }

  this.`cephfs`.block()
}


fun  model_Volume.`cephfs`(block: model_CephFSVolumeSource.() -> Unit = {}) {
  if(this.`cephfs` == null) {
    this.`cephfs` = model_CephFSVolumeSource()
  }

  this.`cephfs`.block()
}

