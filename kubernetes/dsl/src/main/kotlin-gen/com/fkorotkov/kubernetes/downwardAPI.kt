// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`downwardAPI`(block: DownwardAPIVolumeSource.() -> Unit = {}) {
  if(this.`downwardAPI` == null) {
    this.`downwardAPI` = DownwardAPIVolumeSource()
  }

  this.`downwardAPI`.block()
}

