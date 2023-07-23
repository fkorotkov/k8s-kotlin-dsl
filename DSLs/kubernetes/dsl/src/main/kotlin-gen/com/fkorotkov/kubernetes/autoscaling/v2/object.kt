// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricSource as v2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricStatus as v2_ObjectMetricStatus


fun  v2_MetricSpec.`object`(block: v2_ObjectMetricSource.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2_ObjectMetricSource()
  }

  this.`object`.block()
}


fun  v2_MetricStatus.`object`(block: v2_ObjectMetricStatus.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2_ObjectMetricStatus()
  }

  this.`object`.block()
}

