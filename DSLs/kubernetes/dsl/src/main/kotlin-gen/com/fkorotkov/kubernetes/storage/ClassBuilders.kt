// GENERATE
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.StorageClass as storage_StorageClass
import io.fabric8.kubernetes.api.model.storage.StorageClassList as storage_StorageClassList
import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentList as storage_VolumeAttachmentList
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus
import io.fabric8.kubernetes.api.model.storage.VolumeError as storage_VolumeError


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

