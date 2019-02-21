// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.MetricSpec as model_MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus as model_MetricStatus
import io.fabric8.kubernetes.api.model.ResourceMetricSource as model_ResourceMetricSource
import io.fabric8.kubernetes.api.model.ResourceMetricStatus as model_ResourceMetricStatus


fun  model_MetricSpec.`resource`(block: model_ResourceMetricSource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = model_ResourceMetricSource()
  }

  this.`resource`.block()
}


fun  model_MetricStatus.`resource`(block: model_ResourceMetricStatus.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = model_ResourceMetricStatus()
  }

  this.`resource`.block()
}

