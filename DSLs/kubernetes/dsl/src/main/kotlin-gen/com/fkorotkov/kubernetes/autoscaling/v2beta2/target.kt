// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricSource as v2beta2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricTarget as v2beta2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricSource as v2beta2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricSource as v2beta2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricSource as v2beta2_ResourceMetricSource


fun  v2beta2_ExternalMetricSource.`target`(block: v2beta2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2beta2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2beta2_ObjectMetricSource.`target`(block: v2beta2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2beta2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2beta2_PodsMetricSource.`target`(block: v2beta2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2beta2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2beta2_ResourceMetricSource.`target`(block: v2beta2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2beta2_MetricTarget()
  }

  this.`target`.block()
}

