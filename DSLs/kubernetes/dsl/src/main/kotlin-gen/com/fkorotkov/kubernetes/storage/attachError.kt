// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus
import io.fabric8.kubernetes.api.model.storage.VolumeError as storage_VolumeError


fun  storage_VolumeAttachmentStatus.`attachError`(block: storage_VolumeError.() -> Unit = {}) {
  if(this.`attachError` == null) {
    this.`attachError` = storage_VolumeError()
  }

  this.`attachError`.block()
}

