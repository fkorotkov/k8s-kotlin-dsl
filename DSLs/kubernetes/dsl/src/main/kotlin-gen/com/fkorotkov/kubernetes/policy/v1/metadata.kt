// GENERATED
package com.fkorotkov.kubernetes.policy.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.policy.v1.Eviction as v1_Eviction
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudget as v1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetList as v1_PodDisruptionBudgetList


fun  v1_Eviction.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_PodDisruptionBudget.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_PodDisruptionBudgetList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

