// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscaler as v2beta1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscalerSpec as v2beta1_HorizontalPodAutoscalerSpec


fun  v2beta1_HorizontalPodAutoscaler.`spec`(block: v2beta1_HorizontalPodAutoscalerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v2beta1_HorizontalPodAutoscalerSpec()
  }

  this.`spec`.block()
}

