// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.VolumeProjection


fun  Volume.`downwardAPI`(block: DownwardAPIVolumeSource.() -> Unit = {}) {
  if(this.`downwardAPI` == null) {
    this.`downwardAPI` = DownwardAPIVolumeSource()
  }

  this.`downwardAPI`.block()
}


fun  VolumeProjection.`downwardAPI`(block: DownwardAPIProjection.() -> Unit = {}) {
  if(this.`downwardAPI` == null) {
    this.`downwardAPI` = DownwardAPIProjection()
  }

  this.`downwardAPI`.block()
}

