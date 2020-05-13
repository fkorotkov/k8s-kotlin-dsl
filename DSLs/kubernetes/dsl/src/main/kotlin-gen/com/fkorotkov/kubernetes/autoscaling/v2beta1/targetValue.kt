// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricSource as v2beta1_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource


fun  v2beta1_ExternalMetricSource.`targetValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = model_Quantity()
  }

  this.`targetValue`.block()
}


fun  v2beta1_ObjectMetricSource.`targetValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = model_Quantity()
  }

  this.`targetValue`.block()
}

