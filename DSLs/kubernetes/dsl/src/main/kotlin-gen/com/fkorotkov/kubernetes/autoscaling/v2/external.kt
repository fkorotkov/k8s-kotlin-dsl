// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricSource as v2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricStatus as v2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus


fun  v2_MetricSpec.`external`(block: v2_ExternalMetricSource.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v2_ExternalMetricSource()
  }

  this.`external`.block()
}


fun  v2_MetricStatus.`external`(block: v2_ExternalMetricStatus.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v2_ExternalMetricStatus()
  }

  this.`external`.block()
}

