// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HPAScalingRules as v2_HPAScalingRules
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerBehavior as v2_HorizontalPodAutoscalerBehavior


fun  v2_HorizontalPodAutoscalerBehavior.`scaleDown`(block: v2_HPAScalingRules.() -> Unit = {}) {
  if(this.`scaleDown` == null) {
    this.`scaleDown` = v2_HPAScalingRules()
  }

  this.`scaleDown`.block()
}

