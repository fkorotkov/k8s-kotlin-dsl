// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscaler as v2beta1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscalerStatus as v2beta1_HorizontalPodAutoscalerStatus


fun  v2beta1_HorizontalPodAutoscaler.`status`(block: v2beta1_HorizontalPodAutoscalerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v2beta1_HorizontalPodAutoscalerStatus()
  }

  this.`status`.block()
}

