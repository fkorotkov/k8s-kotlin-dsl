// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`cephfs`(block: CephFSPersistentVolumeSource.() -> Unit = {}) {
  if(this.`cephfs` == null) {
    this.`cephfs` = CephFSPersistentVolumeSource()
  }

  this.`cephfs`.block()
}


fun  Volume.`cephfs`(block: CephFSVolumeSource.() -> Unit = {}) {
  if(this.`cephfs` == null) {
    this.`cephfs` = CephFSVolumeSource()
  }

  this.`cephfs`.block()
}

