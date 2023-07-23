// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscaler as v2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerSpec as v2_HorizontalPodAutoscalerSpec


fun  v2_HorizontalPodAutoscaler.`spec`(block: v2_HorizontalPodAutoscalerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v2_HorizontalPodAutoscalerSpec()
  }

  this.`spec`.block()
}

