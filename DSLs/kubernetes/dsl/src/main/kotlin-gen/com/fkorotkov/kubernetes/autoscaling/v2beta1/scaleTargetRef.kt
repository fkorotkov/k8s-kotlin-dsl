// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.CrossVersionObjectReference as v2beta1_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscalerSpec as v2beta1_HorizontalPodAutoscalerSpec


fun  v2beta1_HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: v2beta1_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = v2beta1_CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

