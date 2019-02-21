// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.NodeAffinity as model_NodeAffinity
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity as model_VolumeNodeAffinity


fun  model_Affinity.`nodeAffinity`(block: model_NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = model_NodeAffinity()
  }

  this.`nodeAffinity`.block()
}


fun  model_PersistentVolumeSpec.`nodeAffinity`(block: model_VolumeNodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = model_VolumeNodeAffinity()
  }

  this.`nodeAffinity`.block()
}

