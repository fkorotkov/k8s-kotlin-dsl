// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceAccountTokenProjection
import io.fabric8.kubernetes.api.model.VolumeProjection


fun  VolumeProjection.`serviceAccountToken`(block: ServiceAccountTokenProjection.() -> Unit = {}) {
  if(this.`serviceAccountToken` == null) {
    this.`serviceAccountToken` = ServiceAccountTokenProjection()
  }

  this.`serviceAccountToken`.block()
}

