// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`emptyDir`(block: EmptyDirVolumeSource.() -> Unit = {}) {
  if(this.`emptyDir` == null) {
    this.`emptyDir` = EmptyDirVolumeSource()
  }

  this.`emptyDir`.block()
}

