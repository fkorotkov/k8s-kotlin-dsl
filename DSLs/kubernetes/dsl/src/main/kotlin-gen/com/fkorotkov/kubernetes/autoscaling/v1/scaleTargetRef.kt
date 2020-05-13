// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v1

import io.fabric8.kubernetes.api.model.autoscaling.v1.CrossVersionObjectReference as v1_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerSpec as v1_HorizontalPodAutoscalerSpec


fun  v1_HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: v1_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = v1_CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

