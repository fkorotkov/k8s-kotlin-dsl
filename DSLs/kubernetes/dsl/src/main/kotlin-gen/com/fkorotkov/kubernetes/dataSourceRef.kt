// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedObjectReference as model_TypedObjectReference


fun  model_PersistentVolumeClaimSpec.`dataSourceRef`(block: model_TypedObjectReference.() -> Unit = {}) {
  if(this.`dataSourceRef` == null) {
    this.`dataSourceRef` = model_TypedObjectReference()
  }

  this.`dataSourceRef`.block()
}

