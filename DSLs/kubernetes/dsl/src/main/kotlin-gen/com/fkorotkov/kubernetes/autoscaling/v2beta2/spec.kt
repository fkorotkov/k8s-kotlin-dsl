// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscaler as v2beta2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerSpec as v2beta2_HorizontalPodAutoscalerSpec


fun  v2beta2_HorizontalPodAutoscaler.`spec`(block: v2beta2_HorizontalPodAutoscalerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v2beta2_HorizontalPodAutoscalerSpec()
  }

  this.`spec`.block()
}

