// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference


fun  model_PersistentVolumeClaimSpec.`dataSource`(block: model_TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`dataSource` == null) {
    this.`dataSource` = model_TypedLocalObjectReference()
  }

  this.`dataSource`.block()
}

