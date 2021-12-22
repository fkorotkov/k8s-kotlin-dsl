// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference


fun  model_PersistentVolumeClaimSpec.`dataSourceRef`(block: model_TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`dataSourceRef` == null) {
    this.`dataSourceRef` = model_TypedLocalObjectReference()
  }

  this.`dataSourceRef`.block()
}

