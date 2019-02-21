// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource
import io.fabric8.kubernetes.api.model.ExternalMetricStatus
import io.fabric8.kubernetes.api.model.LabelSelector


fun  ExternalMetricSource.`metricSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = LabelSelector()
  }

  this.`metricSelector`.block()
}


fun  ExternalMetricStatus.`metricSelector`(block: LabelSelector.() -> Unit = {}) {
  if(this.`metricSelector` == null) {
    this.`metricSelector` = LabelSelector()
  }

  this.`metricSelector`.block()
}

