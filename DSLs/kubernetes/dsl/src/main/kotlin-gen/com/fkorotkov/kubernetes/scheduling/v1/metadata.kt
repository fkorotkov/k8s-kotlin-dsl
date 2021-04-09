// GENERATED
package com.fkorotkov.kubernetes.scheduling.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClass as v1_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClassList as v1_PriorityClassList


fun  v1_PriorityClass.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_PriorityClassList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

