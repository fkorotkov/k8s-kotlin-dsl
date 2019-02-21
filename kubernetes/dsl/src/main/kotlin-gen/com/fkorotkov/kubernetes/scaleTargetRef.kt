// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CrossVersionObjectReference as model_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerSpec as model_HorizontalPodAutoscalerSpec


fun  model_HorizontalPodAutoscalerSpec.`scaleTargetRef`(block: model_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`scaleTargetRef` == null) {
    this.`scaleTargetRef` = model_CrossVersionObjectReference()
  }

  this.`scaleTargetRef`.block()
}

