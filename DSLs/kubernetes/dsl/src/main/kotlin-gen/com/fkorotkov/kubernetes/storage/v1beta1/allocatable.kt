// GENERATED
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeDriver as v1beta1_CSINodeDriver
import io.fabric8.kubernetes.api.model.storage.v1beta1.VolumeNodeResources as v1beta1_VolumeNodeResources


fun  v1beta1_CSINodeDriver.`allocatable`(block: v1beta1_VolumeNodeResources.() -> Unit = {}) {
  if(this.`allocatable` == null) {
    this.`allocatable` = v1beta1_VolumeNodeResources()
  }

  this.`allocatable`.block()
}

