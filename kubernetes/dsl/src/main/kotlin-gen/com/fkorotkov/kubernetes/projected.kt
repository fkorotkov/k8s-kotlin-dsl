// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ProjectedVolumeSource as model_ProjectedVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_Volume.`projected`(block: model_ProjectedVolumeSource.() -> Unit = {}) {
  if(this.`projected` == null) {
    this.`projected` = model_ProjectedVolumeSource()
  }

  this.`projected`.block()
}

