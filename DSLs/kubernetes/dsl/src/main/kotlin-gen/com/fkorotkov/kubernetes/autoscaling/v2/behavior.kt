// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerBehavior as v2_HorizontalPodAutoscalerBehavior
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerSpec as v2_HorizontalPodAutoscalerSpec


fun  v2_HorizontalPodAutoscalerSpec.`behavior`(block: v2_HorizontalPodAutoscalerBehavior.() -> Unit = {}) {
  if(this.`behavior` == null) {
    this.`behavior` = v2_HorizontalPodAutoscalerBehavior()
  }

  this.`behavior`.block()
}

