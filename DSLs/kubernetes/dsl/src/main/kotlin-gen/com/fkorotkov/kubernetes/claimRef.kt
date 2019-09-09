// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec


fun  model_PersistentVolumeSpec.`claimRef`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`claimRef` == null) {
    this.`claimRef` = model_ObjectReference()
  }

  this.`claimRef`.block()
}

