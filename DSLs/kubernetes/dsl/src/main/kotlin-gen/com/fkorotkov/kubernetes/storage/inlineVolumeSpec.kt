// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource


fun  storage_VolumeAttachmentSource.`inlineVolumeSpec`(block: model_PersistentVolumeSpec.() -> Unit = {}) {
  if(this.`inlineVolumeSpec` == null) {
    this.`inlineVolumeSpec` = model_PersistentVolumeSpec()
  }

  this.`inlineVolumeSpec`.block()
}

