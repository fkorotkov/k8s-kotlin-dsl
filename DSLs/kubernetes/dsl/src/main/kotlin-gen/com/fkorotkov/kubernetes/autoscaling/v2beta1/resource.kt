// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ResourceMetricSource as v2beta1_ResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ResourceMetricStatus as v2beta1_ResourceMetricStatus


fun  v2beta1_MetricSpec.`resource`(block: v2beta1_ResourceMetricSource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = v2beta1_ResourceMetricSource()
  }

  this.`resource`.block()
}


fun  v2beta1_MetricStatus.`resource`(block: v2beta1_ResourceMetricStatus.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = v2beta1_ResourceMetricStatus()
  }

  this.`resource`.block()
}

