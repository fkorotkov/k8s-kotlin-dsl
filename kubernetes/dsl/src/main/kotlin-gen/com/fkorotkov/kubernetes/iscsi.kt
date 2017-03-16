// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`iscsi`(block: ISCSIVolumeSource.() -> Unit = {}) {
  if(this.`iscsi` == null) {
    this.`iscsi` = ISCSIVolumeSource()
  }

  this.`iscsi`.block()
}


fun  Volume.`iscsi`(block: ISCSIVolumeSource.() -> Unit = {}) {
  if(this.`iscsi` == null) {
    this.`iscsi` = ISCSIVolumeSource()
  }

  this.`iscsi`.block()
}

