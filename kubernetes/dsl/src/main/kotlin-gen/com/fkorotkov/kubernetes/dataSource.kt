// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedLocalObjectReference


fun  PersistentVolumeClaimSpec.`dataSource`(block: TypedLocalObjectReference.() -> Unit = {}) {
  if(this.`dataSource` == null) {
    this.`dataSource` = TypedLocalObjectReference()
  }

  this.`dataSource`.block()
}

