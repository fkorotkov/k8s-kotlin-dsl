// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscaler as v2beta2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerList as v2beta2_HorizontalPodAutoscalerList


fun  v2beta2_HorizontalPodAutoscaler.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v2beta2_HorizontalPodAutoscalerList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

