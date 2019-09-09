// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIProjection as model_DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource as model_DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection


fun  model_Volume.`downwardAPI`(block: model_DownwardAPIVolumeSource.() -> Unit = {}) {
  if(this.`downwardAPI` == null) {
    this.`downwardAPI` = model_DownwardAPIVolumeSource()
  }

  this.`downwardAPI`.block()
}


fun  model_VolumeProjection.`downwardAPI`(block: model_DownwardAPIProjection.() -> Unit = {}) {
  if(this.`downwardAPI` == null) {
    this.`downwardAPI` = model_DownwardAPIProjection()
  }

  this.`downwardAPI`.block()
}

