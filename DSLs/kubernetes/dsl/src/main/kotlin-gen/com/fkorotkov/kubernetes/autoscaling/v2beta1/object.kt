// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus


fun  v2beta1_MetricSpec.`object`(block: v2beta1_ObjectMetricSource.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2beta1_ObjectMetricSource()
  }

  this.`object`.block()
}


fun  v2beta1_MetricStatus.`object`(block: v2beta1_ObjectMetricStatus.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = v2beta1_ObjectMetricStatus()
  }

  this.`object`.block()
}

