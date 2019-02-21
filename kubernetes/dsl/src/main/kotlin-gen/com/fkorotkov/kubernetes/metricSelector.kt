// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource as model_ExternalMetricSource
import io.fabric8.kubernetes.api.model.ExternalMetricStatus as model_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector


fun  model_ExternalMetricSource.`metricSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = model_LabelSelector()
  }

  this.`metricSelector`.block()
}


fun  model_ExternalMetricStatus.`metricSelector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = model_LabelSelector()
  }

  this.`metricSelector`.block()
}

