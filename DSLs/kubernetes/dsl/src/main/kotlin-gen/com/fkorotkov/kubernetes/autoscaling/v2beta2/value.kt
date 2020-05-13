// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricTarget as v2beta2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricValueStatus as v2beta2_MetricValueStatus


fun  v2beta2_MetricTarget.`value`(block: model_Quantity.() -> Unit = {}) {
  if(this.`value` == null) {
    this.`value` = model_Quantity()
  }

  this.`value`.block()
}


fun  v2beta2_MetricValueStatus.`value`(block: model_Quantity.() -> Unit = {}) {
  if(this.`value` == null) {
    this.`value` = model_Quantity()
  }

  this.`value`.block()
}

