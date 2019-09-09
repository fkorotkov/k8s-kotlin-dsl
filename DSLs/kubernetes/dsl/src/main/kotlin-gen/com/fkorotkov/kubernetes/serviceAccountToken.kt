// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceAccountTokenProjection as model_ServiceAccountTokenProjection
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection


fun  model_VolumeProjection.`serviceAccountToken`(block: model_ServiceAccountTokenProjection.() -> Unit = {}) {
  if(this.`serviceAccountToken` == null) {
    this.`serviceAccountToken` = model_ServiceAccountTokenProjection()
  }

  this.`serviceAccountToken`.block()
}

