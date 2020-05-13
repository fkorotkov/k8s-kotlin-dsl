// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerBehavior as v2beta2_HorizontalPodAutoscalerBehavior
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerSpec as v2beta2_HorizontalPodAutoscalerSpec


fun  v2beta2_HorizontalPodAutoscalerSpec.`behavior`(block: v2beta2_HorizontalPodAutoscalerBehavior.() -> Unit = {}) {
  if(this.`behavior` == null) {
    this.`behavior` = v2beta2_HorizontalPodAutoscalerBehavior()
  }

  this.`behavior`.block()
}

