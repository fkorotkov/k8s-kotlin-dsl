// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricStatus
import io.fabric8.kubernetes.api.model.PodsMetricStatus
import io.fabric8.kubernetes.api.model.Quantity
import io.fabric8.kubernetes.api.model.ResourceMetricStatus


fun  ExternalMetricStatus.`currentAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  PodsMetricStatus.`currentAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  ResourceMetricStatus.`currentAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = Quantity()
  }

  this.`currentAverageValue`.block()
}

