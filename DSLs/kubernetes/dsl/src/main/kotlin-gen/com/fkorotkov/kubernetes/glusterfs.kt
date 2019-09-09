// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GlusterfsPersistentVolumeSource as model_GlusterfsPersistentVolumeSource
import io.fabric8.kubernetes.api.model.GlusterfsVolumeSource as model_GlusterfsVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`glusterfs`(block: model_GlusterfsPersistentVolumeSource.() -> Unit = {}) {
  if(this.`glusterfs` == null) {
    this.`glusterfs` = model_GlusterfsPersistentVolumeSource()
  }

  this.`glusterfs`.block()
}


fun  model_Volume.`glusterfs`(block: model_GlusterfsVolumeSource.() -> Unit = {}) {
  if(this.`glusterfs` == null) {
    this.`glusterfs` = model_GlusterfsVolumeSource()
  }

  this.`glusterfs`.block()
}

