// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricSource as v2beta2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricStatus as v2beta2_PodsMetricStatus


fun  v2beta2_MetricSpec.`pods`(block: v2beta2_PodsMetricSource.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2beta2_PodsMetricSource()
  }

  this.`pods`.block()
}


fun  v2beta2_MetricStatus.`pods`(block: v2beta2_PodsMetricStatus.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2beta2_PodsMetricStatus()
  }

  this.`pods`.block()
}

