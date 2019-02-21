// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource as model_ExternalMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity


fun  model_ExternalMetricSource.`targetValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = model_Quantity()
  }

  this.`targetValue`.block()
}


fun  model_ObjectMetricSource.`targetValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = model_Quantity()
  }

  this.`targetValue`.block()
}

