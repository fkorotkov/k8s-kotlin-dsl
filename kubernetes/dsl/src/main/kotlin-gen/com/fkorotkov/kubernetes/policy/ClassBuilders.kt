// GENERATE
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList as policy_PodDisruptionBudgetList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetSpec as policy_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetStatus as policy_PodDisruptionBudgetStatus


fun newPodDisruptionBudget(block : policy_PodDisruptionBudget.() -> Unit = {}): policy_PodDisruptionBudget {
  val instance = policy_PodDisruptionBudget()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetList(block : policy_PodDisruptionBudgetList.() -> Unit = {}): policy_PodDisruptionBudgetList {
  val instance = policy_PodDisruptionBudgetList()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetSpec(block : policy_PodDisruptionBudgetSpec.() -> Unit = {}): policy_PodDisruptionBudgetSpec {
  val instance = policy_PodDisruptionBudgetSpec()
  instance.block()
  return instance
}


fun newPodDisruptionBudgetStatus(block : policy_PodDisruptionBudgetStatus.() -> Unit = {}): policy_PodDisruptionBudgetStatus {
  val instance = policy_PodDisruptionBudgetStatus()
  instance.block()
  return instance
}

