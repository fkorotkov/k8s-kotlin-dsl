// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.SecretVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  Volume.`secret`(block: SecretVolumeSource.() -> Unit = {}) {
  if(this.`secret` == null) {
    this.`secret` = SecretVolumeSource()
  }

  this.`secret`.block()
}

