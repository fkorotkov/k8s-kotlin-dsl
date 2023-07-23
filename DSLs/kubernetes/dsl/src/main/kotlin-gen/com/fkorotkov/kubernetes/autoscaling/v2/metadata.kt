// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscaler as v2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerList as v2_HorizontalPodAutoscalerList


fun  v2_HorizontalPodAutoscaler.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v2_HorizontalPodAutoscalerList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

