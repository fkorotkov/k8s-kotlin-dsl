// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricStatus
import io.fabric8.kubernetes.api.model.ObjectMetricStatus
import io.fabric8.kubernetes.api.model.Quantity


fun  ExternalMetricStatus.`currentValue`(block: Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = Quantity()
  }

  this.`currentValue`.block()
}


fun  ObjectMetricStatus.`currentValue`(block: Quantity.() -> Unit = {}) {
  if(this.`currentValue` == null) {
    this.`currentValue` = Quantity()
  }

  this.`currentValue`.block()
}

