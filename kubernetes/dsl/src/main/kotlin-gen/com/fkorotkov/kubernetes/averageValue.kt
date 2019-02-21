// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus
import io.fabric8.kubernetes.api.model.Quantity


fun  ObjectMetricSource.`averageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = Quantity()
  }

  this.`averageValue`.block()
}


fun  ObjectMetricStatus.`averageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`averageValue` == null) {
    this.`averageValue` = Quantity()
  }

  this.`averageValue`.block()
}

