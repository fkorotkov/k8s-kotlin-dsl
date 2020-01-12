// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.MetricSpec as model_MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus as model_MetricStatus
import io.fabric8.kubernetes.api.model.PodsMetricSource as model_PodsMetricSource
import io.fabric8.kubernetes.api.model.PodsMetricStatus as model_PodsMetricStatus


fun  model_MetricSpec.`pods`(block: model_PodsMetricSource.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = model_PodsMetricSource()
  }

  this.`pods`.block()
}


fun  model_MetricStatus.`pods`(block: model_PodsMetricStatus.() -> Unit = {}) {
  if(this.`pods` == null) {
    this.`pods` = model_PodsMetricStatus()
  }

  this.`pods`.block()
}

