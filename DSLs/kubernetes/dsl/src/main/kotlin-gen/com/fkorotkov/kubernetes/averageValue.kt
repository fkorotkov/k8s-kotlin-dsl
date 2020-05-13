// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.MetricTarget as model_MetricTarget
import io.fabric8.kubernetes.api.model.MetricValueStatus as model_MetricValueStatus
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity


fun  model_MetricTarget.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}


fun  model_MetricValueStatus.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}

