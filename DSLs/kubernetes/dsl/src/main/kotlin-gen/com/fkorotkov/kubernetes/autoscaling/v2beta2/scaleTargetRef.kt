// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.CrossVersionObjectReference as v2beta2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerSpec as v2beta2_HorizontalPodAutoscalerSpec


fun  v2beta2_HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: v2beta2_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = v2beta2_CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

