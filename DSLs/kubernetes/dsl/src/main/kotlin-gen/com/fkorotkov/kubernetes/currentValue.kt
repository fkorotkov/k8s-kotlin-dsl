// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricStatus as model_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.ObjectMetricStatus as model_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity


fun  model_ExternalMetricStatus.`currentValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = model_Quantity()
  }

  this.`currentValue`.block()
}


fun  model_ObjectMetricStatus.`currentValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = model_Quantity()
  }

  this.`currentValue`.block()
}

