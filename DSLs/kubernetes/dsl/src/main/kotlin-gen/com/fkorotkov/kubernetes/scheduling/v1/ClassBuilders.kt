// GENERATE
package com.fkorotkov.kubernetes.scheduling.v1

import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClass as v1_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClassList as v1_PriorityClassList


fun newPriorityClass(block : v1_PriorityClass.() -> Unit = {}): v1_PriorityClass {
  val instance = v1_PriorityClass()
  instance.block()
  return instance
}


fun newPriorityClassList(block : v1_PriorityClassList.() -> Unit = {}): v1_PriorityClassList {
  val instance = v1_PriorityClassList()
  instance.block()
  return instance
}

