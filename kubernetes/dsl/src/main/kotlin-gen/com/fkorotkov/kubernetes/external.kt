// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource
import io.fabric8.kubernetes.api.model.ExternalMetricStatus
import io.fabric8.kubernetes.api.model.MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus


fun  MetricSpec.`external`(block: ExternalMetricSource.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = ExternalMetricSource()
  }

  this.`external`.block()
}


fun  MetricStatus.`external`(block: ExternalMetricStatus.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = ExternalMetricStatus()
  }

  this.`external`.block()
}

