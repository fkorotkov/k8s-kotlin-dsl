// GENERATE
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.policy.v1.Eviction as v1_Eviction
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudget as v1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetList as v1_PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetStatus as v1_PodDisruptionBudgetStatus


fun newEviction(block : v1_Eviction.() -> Unit = {}): v1_Eviction {
  val instance = v1_Eviction()
  instance.block()
  return instance
}


fun newPodDisruptionBudget(block : v1_PodDisruptionBudget.() -> Unit = {}): v1_PodDisruptionBudget {
  val instance = v1_PodDisruptionBudget()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetList(block : v1_PodDisruptionBudgetList.() -> Unit = {}): v1_PodDisruptionBudgetList {
  val instance = v1_PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetSpec(block : v1_PodDisruptionBudgetSpec.() -> Unit = {}): v1_PodDisruptionBudgetSpec {
  val instance = v1_PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetStatus(block : v1_PodDisruptionBudgetStatus.() -> Unit = {}): v1_PodDisruptionBudgetStatus {
  val instance = v1_PodDisruptionBudgetStatus()
  instance.block()
  return instance
}

