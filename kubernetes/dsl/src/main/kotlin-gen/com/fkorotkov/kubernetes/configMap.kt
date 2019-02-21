// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapNodeConfigSource
import io.fabric8.kubernetes.api.model.ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.NodeConfigSource
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.VolumeProjection


fun  NodeConfigSource.`configMap`(block: ConfigMapNodeConfigSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = ConfigMapNodeConfigSource()
  }

  this.`configMap`.block()
}


fun  Volume.`configMap`(block: ConfigMapVolumeSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = ConfigMapVolumeSource()
  }

  this.`configMap`.block()
}


fun  VolumeProjection.`configMap`(block: ConfigMapProjection.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = ConfigMapProjection()
  }

  this.`configMap`.block()
}

