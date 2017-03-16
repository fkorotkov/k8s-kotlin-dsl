// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.QuobyteVolumeSource
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`quobyte`(block: QuobyteVolumeSource.() -> Unit = {}) {
  if(this.`quobyte` == null) {
    this.`quobyte` = QuobyteVolumeSource()
  }

  this.`quobyte`.block()
}


fun  Volume.`quobyte`(block: QuobyteVolumeSource.() -> Unit = {}) {
  if(this.`quobyte` == null) {
    this.`quobyte` = QuobyteVolumeSource()
  }

  this.`quobyte`.block()
}

