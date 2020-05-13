// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricStatus as v2beta1_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus


fun  v2beta1_ExternalMetricStatus.`currentValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = model_Quantity()
  }

  this.`currentValue`.block()
}


fun  v2beta1_ObjectMetricStatus.`currentValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = model_Quantity()
  }

  this.`currentValue`.block()
}

