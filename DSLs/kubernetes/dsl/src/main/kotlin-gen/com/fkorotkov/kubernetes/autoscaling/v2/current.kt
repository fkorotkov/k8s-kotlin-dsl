// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricStatus as v2_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricStatus as v2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricValueStatus as v2_MetricValueStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricStatus as v2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricStatus as v2_PodsMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricStatus as v2_ResourceMetricStatus


fun  v2_ContainerResourceMetricStatus.`current`(block: v2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2_ExternalMetricStatus.`current`(block: v2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2_ObjectMetricStatus.`current`(block: v2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2_PodsMetricStatus.`current`(block: v2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2_MetricValueStatus()
  }

  this.`current`.block()
}


fun  v2_ResourceMetricStatus.`current`(block: v2_MetricValueStatus.() -> Unit = {}) {
  if(this.`current` == null) {
    this.`current` = v2_MetricValueStatus()
  }

  this.`current`.block()
}

