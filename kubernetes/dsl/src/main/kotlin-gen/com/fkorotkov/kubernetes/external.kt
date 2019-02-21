// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ExternalMetricSource as model_ExternalMetricSource
import io.fabric8.kubernetes.api.model.ExternalMetricStatus as model_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.MetricSpec as model_MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus as model_MetricStatus


fun  model_MetricSpec.`external`(block: model_ExternalMetricSource.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = model_ExternalMetricSource()
  }

  this.`external`.block()
}


fun  model_MetricStatus.`external`(block: model_ExternalMetricStatus.() -> Unit = {}) {
  if(this.`external` == null) {
    this.`external` = model_ExternalMetricStatus()
  }

  this.`external`.block()
}

