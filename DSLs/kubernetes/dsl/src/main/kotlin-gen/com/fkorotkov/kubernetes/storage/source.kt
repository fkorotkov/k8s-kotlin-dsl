// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec


fun  storage_VolumeAttachmentSpec.`source`(block: storage_VolumeAttachmentSource.() -> Unit = {}) {
  if(this.`source` == null) {
    this.`source` = storage_VolumeAttachmentSource()
  }

  this.`source`.block()
}

