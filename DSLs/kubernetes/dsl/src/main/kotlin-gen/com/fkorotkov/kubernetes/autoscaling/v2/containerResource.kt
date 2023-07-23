// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricSource as v2_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricStatus as v2_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus


fun  v2_MetricSpec.`containerResource`(block: v2_ContainerResourceMetricSource.() -> Unit = {}) {
  if(this.`containerResource` == null) {
    this.`containerResource` = v2_ContainerResourceMetricSource()
  }

  this.`containerResource`.block()
}


fun  v2_MetricStatus.`containerResource`(block: v2_ContainerResourceMetricStatus.() -> Unit = {}) {
  if(this.`containerResource` == null) {
    this.`containerResource` = v2_ContainerResourceMetricStatus()
  }

  this.`containerResource`.block()
}

