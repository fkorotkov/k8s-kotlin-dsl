// GENERATE
package com.fkorotkov.kubernetes.scheduling.v1beta1

import io.fabric8.kubernetes.api.model.scheduling.v1beta1.PriorityClass as v1beta1_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.v1beta1.PriorityClassList as v1beta1_PriorityClassList


fun newPriorityClass(block : v1beta1_PriorityClass.() -> Unit = {}): v1beta1_PriorityClass {
  val instance = v1beta1_PriorityClass()
  instance.block()
  return instance
}


fun newPriorityClassList(block : v1beta1_PriorityClassList.() -> Unit = {}): v1beta1_PriorityClassList {
  val instance = v1beta1_PriorityClassList()
  instance.block()
  return instance
}

