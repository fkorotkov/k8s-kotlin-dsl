// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricSource as v2beta2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricStatus as v2beta2_ObjectMetricStatus


fun  v2beta2_MetricSpec.`object`(block: v2beta2_ObjectMetricSource.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2beta2_ObjectMetricSource()
  }

  this.`object`.block()
}


fun  v2beta2_MetricStatus.`object`(block: v2beta2_ObjectMetricStatus.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2beta2_ObjectMetricStatus()
  }

  this.`object`.block()
}

