// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus as model_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity


fun  model_ObjectMetricSource.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}


fun  model_ObjectMetricStatus.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}

