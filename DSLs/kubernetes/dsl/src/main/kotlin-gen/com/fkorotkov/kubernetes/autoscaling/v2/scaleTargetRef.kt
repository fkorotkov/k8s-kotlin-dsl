// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.CrossVersionObjectReference as v2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerSpec as v2_HorizontalPodAutoscalerSpec


fun  v2_HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: v2_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = v2_CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

