// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricSource as v2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricStatus as v2_PodsMetricStatus


fun  v2_MetricSpec.`pods`(block: v2_PodsMetricSource.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2_PodsMetricSource()
  }

  this.`pods`.block()
}


fun  v2_MetricStatus.`pods`(block: v2_PodsMetricStatus.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2_PodsMetricStatus()
  }

  this.`pods`.block()
}

