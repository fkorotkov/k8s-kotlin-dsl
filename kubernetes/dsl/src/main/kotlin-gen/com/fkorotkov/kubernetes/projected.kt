// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ProjectedVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`projected`(block: ProjectedVolumeSource.() -> Unit = {}) {
  if(this.`projected` == null) {
    this.`projected` = ProjectedVolumeSource()
  }

  this.`projected`.block()
}

