// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.SecretProjection
import io.fabric8.kubernetes.api.model.SecretVolumeSource
import io.fabric8.kubernetes.api.model.Volume
import io.fabric8.kubernetes.api.model.VolumeProjection


fun  Volume.`secret`(block: SecretVolumeSource.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = SecretVolumeSource()
  }

  this.`secret`.block()
}


fun  VolumeProjection.`secret`(block: SecretProjection.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = SecretProjection()
  }

  this.`secret`.block()
}

