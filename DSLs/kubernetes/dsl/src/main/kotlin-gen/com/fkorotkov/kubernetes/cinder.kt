// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CinderPersistentVolumeSource as model_CinderPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource as model_CinderVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`cinder`(block: model_CinderPersistentVolumeSource.() -> Unit = {}) {
  if(this.`cinder` == null) {
    this.`cinder` = model_CinderPersistentVolumeSource()
  }

  this.`cinder`.block()
}


fun  model_Volume.`cinder`(block: model_CinderVolumeSource.() -> Unit = {}) {
  if(this.`cinder` == null) {
    this.`cinder` = model_CinderVolumeSource()
  }

  this.`cinder`.block()
}

