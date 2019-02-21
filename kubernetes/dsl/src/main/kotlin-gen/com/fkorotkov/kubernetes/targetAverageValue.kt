// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource as model_ExternalMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricSource as model_PodsMetricSource
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.ResourceMetricSource as model_ResourceMetricSource


fun  model_ExternalMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  model_PodsMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  model_ResourceMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}

