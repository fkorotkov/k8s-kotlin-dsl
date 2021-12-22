// GENERATED
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.CSIDriver as storage_CSIDriver
import io.fabric8.kubernetes.api.model.storage.CSIDriverSpec as storage_CSIDriverSpec
import io.fabric8.kubernetes.api.model.storage.CSINode as storage_CSINode
import io.fabric8.kubernetes.api.model.storage.CSINodeSpec as storage_CSINodeSpec
import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec


fun  storage_CSIDriver.`spec`(block: storage_CSIDriverSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = storage_CSIDriverSpec()
  }

  this.`spec`.block()
}


fun  storage_CSINode.`spec`(block: storage_CSINodeSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = storage_CSINodeSpec()
  }

  this.`spec`.block()
}


fun  storage_VolumeAttachment.`spec`(block: storage_VolumeAttachmentSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = storage_VolumeAttachmentSpec()
  }

  this.`spec`.block()
}

