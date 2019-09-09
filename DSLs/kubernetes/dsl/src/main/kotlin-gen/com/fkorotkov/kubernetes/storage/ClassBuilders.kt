// GENERATE
package com.fkorotkov.kubernetes.storage

import io.fabric8.kubernetes.api.model.storage.StorageClass as storage_StorageClass
import io.fabric8.kubernetes.api.model.storage.StorageClassList as storage_StorageClassList


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

