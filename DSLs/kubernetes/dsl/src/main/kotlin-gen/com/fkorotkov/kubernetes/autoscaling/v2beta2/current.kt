// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricStatus as v2beta2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricValueStatus as v2beta2_MetricValueStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricStatus as v2beta2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricStatus as v2beta2_PodsMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricStatus as v2beta2_ResourceMetricStatus


fun  v2beta2_ExternalMetricStatus.`current`(block: v2beta2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2beta2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2beta2_ObjectMetricStatus.`current`(block: v2beta2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2beta2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2beta2_PodsMetricStatus.`current`(block: v2beta2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2beta2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2beta2_ResourceMetricStatus.`current`(block: v2beta2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2beta2_MetricValueStatus()
  }

  this.`current`.block()
}

