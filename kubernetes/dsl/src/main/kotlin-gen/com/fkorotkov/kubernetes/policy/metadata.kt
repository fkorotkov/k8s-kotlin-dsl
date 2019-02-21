// GENERATED
package com.fkorotkov.kubernetes.policy

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget as policy_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList as policy_PodDisruptionBudgetList


fun  policy_PodDisruptionBudget.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  policy_PodDisruptionBudgetList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

