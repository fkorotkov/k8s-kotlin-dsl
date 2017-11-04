// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LocalVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec


fun  PersistentVolumeSpec.`local`(block: LocalVolumeSource.() -> Unit = {}) {
  if(this.`local` == null) {
    this.`local` = LocalVolumeSource()
  }

  this.`local`.block()
}

