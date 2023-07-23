// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricTarget as v2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricValueStatus as v2_MetricValueStatus


fun  v2_MetricTarget.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}


fun  v2_MetricValueStatus.`averageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = model_Quantity()
  }

  this.`averageValue`.block()
}

