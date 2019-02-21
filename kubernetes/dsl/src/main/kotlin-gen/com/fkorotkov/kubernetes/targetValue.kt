// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricSource
import io.fabric8.kubernetes.api.model.Quantity


fun  ExternalMetricSource.`targetValue`(block: Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = Quantity()
  }

  this.`targetValue`.block()
}


fun  ObjectMetricSource.`targetValue`(block: Quantity.() -> Unit = {}) {
  if(this.`targetValue` == null) {
    this.`targetValue` = Quantity()
  }

  this.`targetValue`.block()
}

