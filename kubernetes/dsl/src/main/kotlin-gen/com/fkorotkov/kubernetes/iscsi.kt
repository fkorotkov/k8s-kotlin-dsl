// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ISCSIPersistentVolumeSource as model_ISCSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource as model_ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`iscsi`(block: model_ISCSIPersistentVolumeSource.() -> Unit = {}) {
  if(this.`iscsi` == null) {
    this.`iscsi` = model_ISCSIPersistentVolumeSource()
  }

  this.`iscsi`.block()
}


fun  model_Volume.`iscsi`(block: model_ISCSIVolumeSource.() -> Unit = {}) {
  if(this.`iscsi` == null) {
    this.`iscsi` = model_ISCSIVolumeSource()
  }

  this.`iscsi`.block()
}

