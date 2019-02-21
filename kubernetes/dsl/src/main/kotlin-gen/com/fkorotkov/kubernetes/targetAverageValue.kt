// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricSource
import io.fabric8.kubernetes.api.model.Quantity
import io.fabric8.kubernetes.api.model.ResourceMetricSource


fun  ExternalMetricSource.`targetAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  PodsMetricSource.`targetAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  ResourceMetricSource.`targetAverageValue`(block: Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = Quantity()
  }

  this.`targetAverageValue`.block()
}

