// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`configMap`(block: ConfigMapVolumeSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = ConfigMapVolumeSource()
  }

  this.`configMap`.block()
}

