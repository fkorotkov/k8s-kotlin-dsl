// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.ResourceRequirements as model_ResourceRequirements


fun  model_Container.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


fun  model_EphemeralContainer.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}


fun  model_PersistentVolumeClaimSpec.`resources`(block: model_ResourceRequirements.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = model_ResourceRequirements()
  }

  this.`resources`.block()
}

