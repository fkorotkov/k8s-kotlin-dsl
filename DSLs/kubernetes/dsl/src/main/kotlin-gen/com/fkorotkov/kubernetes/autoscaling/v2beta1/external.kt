// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricSource as v2beta1_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricStatus as v2beta1_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus


fun  v2beta1_MetricSpec.`external`(block: v2beta1_ExternalMetricSource.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v2beta1_ExternalMetricSource()
  }

  this.`external`.block()
}


fun  v2beta1_MetricStatus.`external`(block: v2beta1_ExternalMetricStatus.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = v2beta1_ExternalMetricStatus()
  }

  this.`external`.block()
}

