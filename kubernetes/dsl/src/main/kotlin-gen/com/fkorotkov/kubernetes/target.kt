// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.CrossVersionObjectReference as model_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus as model_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference


fun  model_Binding.`target`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_ObjectReference()
  }

  this.`target`.block()
}


fun  model_ObjectMetricSource.`target`(block: model_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_CrossVersionObjectReference()
  }

  this.`target`.block()
}


fun  model_ObjectMetricStatus.`target`(block: model_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_CrossVersionObjectReference()
  }

  this.`target`.block()
}

