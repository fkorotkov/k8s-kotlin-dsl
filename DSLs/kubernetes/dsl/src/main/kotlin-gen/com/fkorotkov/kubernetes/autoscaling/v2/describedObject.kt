// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.CrossVersionObjectReference as v2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricSource as v2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricStatus as v2_ObjectMetricStatus


fun  v2_ObjectMetricSource.`describedObject`(block: v2_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`describedObject` == null) {
    this.`describedObject` = v2_CrossVersionObjectReference()
  }

  this.`describedObject`.block()
}


fun  v2_ObjectMetricStatus.`describedObject`(block: v2_CrossVersionObjectReference.() -> Unit = {}) {
  if(this.`describedObject` == null) {
    this.`describedObject` = v2_CrossVersionObjectReference()
  }

  this.`describedObject`.block()
}

