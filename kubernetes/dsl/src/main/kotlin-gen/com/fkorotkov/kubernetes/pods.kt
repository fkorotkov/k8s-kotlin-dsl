// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus
import io.fabric8.kubernetes.api.model.PodsMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricStatus


fun  MetricSpec.`pods`(block: PodsMetricSource.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = PodsMetricSource()
  }

  this.`pods`.block()
}


fun  MetricStatus.`pods`(block: PodsMetricStatus.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = PodsMetricStatus()
  }

  this.`pods`.block()
}

