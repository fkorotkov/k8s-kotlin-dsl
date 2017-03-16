// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HostPathVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`hostPath`(block: HostPathVolumeSource.() -> Unit = {}) {
  if(this.`hostPath` == null) {
    this.`hostPath` = HostPathVolumeSource()
  }

  this.`hostPath`.block()
}


fun  Volume.`hostPath`(block: HostPathVolumeSource.() -> Unit = {}) {
  if(this.`hostPath` == null) {
    this.`hostPath` = HostPathVolumeSource()
  }

  this.`hostPath`.block()
}

