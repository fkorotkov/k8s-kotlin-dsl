// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v1

import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscaler as v1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerStatus as v1_HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.autoscaling.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.autoscaling.v1.ScaleStatus as v1_ScaleStatus


fun  v1_HorizontalPodAutoscaler.`status`(block: v1_HorizontalPodAutoscalerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_HorizontalPodAutoscalerStatus()
  }

  this.`status`.block()
}


fun  v1_Scale.`status`(block: v1_ScaleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ScaleStatus()
  }

  this.`status`.block()
}

