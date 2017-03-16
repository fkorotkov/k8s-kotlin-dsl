// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectReference
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec


fun  PersistentVolumeSpec.`claimRef`(block: ObjectReference.() -> Unit = {}) {
  if(this.`claimRef` == null) {
    this.`claimRef` = ObjectReference()
  }

  this.`claimRef`.block()
}

