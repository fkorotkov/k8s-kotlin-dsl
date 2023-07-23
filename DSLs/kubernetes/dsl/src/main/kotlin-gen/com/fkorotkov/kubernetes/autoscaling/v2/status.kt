// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscaler as v2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerStatus as v2_HorizontalPodAutoscalerStatus


fun  v2_HorizontalPodAutoscaler.`status`(block: v2_HorizontalPodAutoscalerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v2_HorizontalPodAutoscalerStatus()
  }

  this.`status`.block()
}

