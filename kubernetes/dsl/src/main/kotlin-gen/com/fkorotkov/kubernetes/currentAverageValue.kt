// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricStatus as model_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.PodsMetricStatus as model_PodsMetricStatus
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.ResourceMetricStatus as model_ResourceMetricStatus


fun  model_ExternalMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  model_PodsMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  model_ResourceMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}

