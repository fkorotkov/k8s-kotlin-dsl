// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EphemeralVolumeSource as model_EphemeralVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimTemplate as model_PersistentVolumeClaimTemplate


fun  model_EphemeralVolumeSource.`volumeClaimTemplate`(block: model_PersistentVolumeClaimTemplate.() -> Unit = {}) {
  if(this.`volumeClaimTemplate` == null) {
    this.`volumeClaimTemplate` = model_PersistentVolumeClaimTemplate()
  }

  this.`volumeClaimTemplate`.block()
}

