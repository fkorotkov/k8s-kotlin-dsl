// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.PodsMetricSource as v2beta1_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.PodsMetricStatus as v2beta1_PodsMetricStatus


fun  v2beta1_MetricSpec.`pods`(block: v2beta1_PodsMetricSource.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2beta1_PodsMetricSource()
  }

  this.`pods`.block()
}


fun  v2beta1_MetricStatus.`pods`(block: v2beta1_PodsMetricStatus.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = v2beta1_PodsMetricStatus()
  }

  this.`pods`.block()
}

