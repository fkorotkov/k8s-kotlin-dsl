// GENERATE
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.CSIDriver as storage_CSIDriver
import io.fabric8.kubernetes.api.model.storage.CSIDriverList as storage_CSIDriverList
import io.fabric8.kubernetes.api.model.storage.CSIDriverSpec as storage_CSIDriverSpec
import io.fabric8.kubernetes.api.model.storage.CSINode as storage_CSINode
import io.fabric8.kubernetes.api.model.storage.CSINodeDriver as storage_CSINodeDriver
import io.fabric8.kubernetes.api.model.storage.CSINodeList as storage_CSINodeList
import io.fabric8.kubernetes.api.model.storage.CSINodeSpec as storage_CSINodeSpec
import io.fabric8.kubernetes.api.model.storage.StorageClass as storage_StorageClass
import io.fabric8.kubernetes.api.model.storage.StorageClassList as storage_StorageClassList
import io.fabric8.kubernetes.api.model.storage.TokenRequest as storage_TokenRequest
import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentList as storage_VolumeAttachmentList
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus
import io.fabric8.kubernetes.api.model.storage.VolumeError as storage_VolumeError
import io.fabric8.kubernetes.api.model.storage.VolumeNodeResources as storage_VolumeNodeResources


fun newCSIDriver(block : storage_CSIDriver.() -> Unit = {}): storage_CSIDriver {
  val instance = storage_CSIDriver()
  instance.block()
  return instance
}


fun newCSIDriverList(block : storage_CSIDriverList.() -> Unit = {}): storage_CSIDriverList {
  val instance = storage_CSIDriverList()
  instance.block()
  return instance
}


fun newCSIDriverSpec(block : storage_CSIDriverSpec.() -> Unit = {}): storage_CSIDriverSpec {
  val instance = storage_CSIDriverSpec()
  instance.block()
  return instance
}


fun newCSINode(block : storage_CSINode.() -> Unit = {}): storage_CSINode {
  val instance = storage_CSINode()
  instance.block()
  return instance
}


fun newCSINodeDriver(block : storage_CSINodeDriver.() -> Unit = {}): storage_CSINodeDriver {
  val instance = storage_CSINodeDriver()
  instance.block()
  return instance
}


fun newCSINodeList(block : storage_CSINodeList.() -> Unit = {}): storage_CSINodeList {
  val instance = storage_CSINodeList()
  instance.block()
  return instance
}


fun newCSINodeSpec(block : storage_CSINodeSpec.() -> Unit = {}): storage_CSINodeSpec {
  val instance = storage_CSINodeSpec()
  instance.block()
  return instance
}


fun newStorageClass(block : storage_StorageClass.() -> Unit = {}): storage_StorageClass {
  val instance = storage_StorageClass()
  instance.block()
  return instance
}


fun newStorageClassList(block : storage_StorageClassList.() -> Unit = {}): storage_StorageClassList {
  val instance = storage_StorageClassList()
  instance.block()
  return instance
}


fun newTokenRequest(block : storage_TokenRequest.() -> Unit = {}): storage_TokenRequest {
  val instance = storage_TokenRequest()
  instance.block()
  return instance
}


fun newVolumeAttachment(block : storage_VolumeAttachment.() -> Unit = {}): storage_VolumeAttachment {
  val instance = storage_VolumeAttachment()
  instance.block()
  return instance
}


fun newVolumeAttachmentList(block : storage_VolumeAttachmentList.() -> Unit = {}): storage_VolumeAttachmentList {
  val instance = storage_VolumeAttachmentList()
  instance.block()
  return instance
}


fun newVolumeAttachmentSource(block : storage_VolumeAttachmentSource.() -> Unit = {}): storage_VolumeAttachmentSource {
  val instance = storage_VolumeAttachmentSource()
  instance.block()
  return instance
}


fun newVolumeAttachmentSpec(block : storage_VolumeAttachmentSpec.() -> Unit = {}): storage_VolumeAttachmentSpec {
  val instance = storage_VolumeAttachmentSpec()
  instance.block()
  return instance
}


fun newVolumeAttachmentStatus(block : storage_VolumeAttachmentStatus.() -> Unit = {}): storage_VolumeAttachmentStatus {
  val instance = storage_VolumeAttachmentStatus()
  instance.block()
  return instance
}


fun newVolumeError(block : storage_VolumeError.() -> Unit = {}): storage_VolumeError {
  val instance = storage_VolumeError()
  instance.block()
  return instance
}


fun newVolumeNodeResources(block : storage_VolumeNodeResources.() -> Unit = {}): storage_VolumeNodeResources {
  val instance = storage_VolumeNodeResources()
  instance.block()
  return instance
}

