// GENERATE
package com.fkorotkov.kubernetes.scheduling

import io.fabric8.kubernetes.api.model.scheduling.PriorityClass as scheduling_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.PriorityClassList as scheduling_PriorityClassList


fun newPriorityClass(block : scheduling_PriorityClass.() -> Unit = {}): scheduling_PriorityClass {
  val instance = scheduling_PriorityClass()
  instance.block()
  return instance
}


fun newPriorityClassList(block : scheduling_PriorityClassList.() -> Unit = {}): scheduling_PriorityClassList {
  val instance = scheduling_PriorityClassList()
  instance.block()
  return instance
}

