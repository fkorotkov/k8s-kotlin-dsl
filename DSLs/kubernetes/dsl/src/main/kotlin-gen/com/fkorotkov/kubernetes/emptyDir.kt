// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource as model_EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_Volume.`emptyDir`(block: model_EmptyDirVolumeSource.() -> Unit = {}) {
  if(this.`emptyDir` == null) {
    this.`emptyDir` = model_EmptyDirVolumeSource()
  }

  this.`emptyDir`.block()
}

