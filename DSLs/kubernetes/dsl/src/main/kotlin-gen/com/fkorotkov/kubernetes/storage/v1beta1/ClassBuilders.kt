// GENERATE
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriver as v1beta1_CSIDriver
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriverList as v1beta1_CSIDriverList
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriverSpec as v1beta1_CSIDriverSpec
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINode as v1beta1_CSINode
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeDriver as v1beta1_CSINodeDriver
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeList as v1beta1_CSINodeList
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeSpec as v1beta1_CSINodeSpec
import io.fabric8.kubernetes.api.model.storage.v1beta1.VolumeNodeResources as v1beta1_VolumeNodeResources


fun newCSIDriver(block : v1beta1_CSIDriver.() -> Unit = {}): v1beta1_CSIDriver {
  val instance = v1beta1_CSIDriver()
  instance.block()
  return instance
}


fun newCSIDriverList(block : v1beta1_CSIDriverList.() -> Unit = {}): v1beta1_CSIDriverList {
  val instance = v1beta1_CSIDriverList()
  instance.block()
  return instance
}


fun newCSIDriverSpec(block : v1beta1_CSIDriverSpec.() -> Unit = {}): v1beta1_CSIDriverSpec {
  val instance = v1beta1_CSIDriverSpec()
  instance.block()
  return instance
}


fun newCSINode(block : v1beta1_CSINode.() -> Unit = {}): v1beta1_CSINode {
  val instance = v1beta1_CSINode()
  instance.block()
  return instance
}


fun newCSINodeDriver(block : v1beta1_CSINodeDriver.() -> Unit = {}): v1beta1_CSINodeDriver {
  val instance = v1beta1_CSINodeDriver()
  instance.block()
  return instance
}


fun newCSINodeList(block : v1beta1_CSINodeList.() -> Unit = {}): v1beta1_CSINodeList {
  val instance = v1beta1_CSINodeList()
  instance.block()
  return instance
}


fun newCSINodeSpec(block : v1beta1_CSINodeSpec.() -> Unit = {}): v1beta1_CSINodeSpec {
  val instance = v1beta1_CSINodeSpec()
  instance.block()
  return instance
}


fun newVolumeNodeResources(block : v1beta1_VolumeNodeResources.() -> Unit = {}): v1beta1_VolumeNodeResources {
  val instance = v1beta1_VolumeNodeResources()
  instance.block()
  return instance
}

