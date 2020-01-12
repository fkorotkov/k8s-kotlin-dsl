// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec


fun  storage_VolumeAttachment.`spec`(block: storage_VolumeAttachmentSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = storage_VolumeAttachmentSpec()
  }

  this.`spec`.block()
}

