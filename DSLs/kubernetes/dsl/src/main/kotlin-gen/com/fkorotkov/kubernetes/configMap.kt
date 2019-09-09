// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ConfigMapNodeConfigSource as model_ConfigMapNodeConfigSource
import io.fabric8.kubernetes.api.model.ConfigMapProjection as model_ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource as model_ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection


fun  model_NodeConfigSource.`configMap`(block: model_ConfigMapNodeConfigSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_ConfigMapNodeConfigSource()
  }

  this.`configMap`.block()
}


fun  model_Volume.`configMap`(block: model_ConfigMapVolumeSource.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_ConfigMapVolumeSource()
  }

  this.`configMap`.block()
}


fun  model_VolumeProjection.`configMap`(block: model_ConfigMapProjection.() -> Unit = {}) {
  if(this.`configMap` == null) {
    this.`configMap` = model_ConfigMapProjection()
  }

  this.`configMap`.block()
}

