// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Affinity
import io.fabric8.kubernetes.api.model.NodeAffinity
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity


fun  Affinity.`nodeAffinity`(block: NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = NodeAffinity()
  }

  this.`nodeAffinity`.block()
}


fun  PersistentVolumeSpec.`nodeAffinity`(block: VolumeNodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = VolumeNodeAffinity()
  }

  this.`nodeAffinity`.block()
}

