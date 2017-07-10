// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerSpec


fun  HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

