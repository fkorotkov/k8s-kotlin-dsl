// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus
import io.fabric8.kubernetes.api.model.storage.VolumeError as storage_VolumeError


fun  storage_VolumeAttachmentStatus.`detachError`(block: storage_VolumeError.() -> Unit = {}) {
  if(this.`detachError` == null) {
    this.`detachError` = storage_VolumeError()
  }

  this.`detachError`.block()
}

