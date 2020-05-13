// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricSource as v2beta1_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.PodsMetricSource as v2beta1_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ResourceMetricSource as v2beta1_ResourceMetricSource


fun  v2beta1_ExternalMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  v2beta1_PodsMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}


fun  v2beta1_ResourceMetricSource.`targetAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`targetAverageValue` == null) {
    this.`targetAverageValue` = model_Quantity()
  }

  this.`targetAverageValue`.block()
}

