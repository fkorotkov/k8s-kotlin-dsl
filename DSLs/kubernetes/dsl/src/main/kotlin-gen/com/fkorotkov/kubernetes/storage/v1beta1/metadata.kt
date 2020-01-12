// GENERATED
package com.fkorotkov.kubernetes.storage.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriver as v1beta1_CSIDriver
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIDriverList as v1beta1_CSIDriverList
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINode as v1beta1_CSINode
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSINodeList as v1beta1_CSINodeList


fun  v1beta1_CSIDriver.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_CSIDriverList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_CSINode.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_CSINodeList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

