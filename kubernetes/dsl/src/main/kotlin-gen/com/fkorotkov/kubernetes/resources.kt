// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.ResourceRequirements


fun  Container.`resources`(block: ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = ResourceRequirements()
  }

  this.`resources`.block()
}


fun  PersistentVolumeClaimSpec.`resources`(block: ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = ResourceRequirements()
  }

  this.`resources`.block()
}

