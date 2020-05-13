// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricSource as v2beta1_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricStatus as v2beta1_ExternalMetricStatus


fun  v2beta1_ExternalMetricSource.`metricSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = model_LabelSelector()
  }

  this.`metricSelector`.block()
}


fun  v2beta1_ExternalMetricStatus.`metricSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = model_LabelSelector()
  }

  this.`metricSelector`.block()
}

