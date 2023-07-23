// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricSource as v2_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricSource as v2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricTarget as v2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricSource as v2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricSource as v2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricSource as v2_ResourceMetricSource


fun  v2_ContainerResourceMetricSource.`target`(block: v2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2_ExternalMetricSource.`target`(block: v2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2_ObjectMetricSource.`target`(block: v2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2_PodsMetricSource.`target`(block: v2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2_MetricTarget()
  }

  this.`target`.block()
}


fun  v2_ResourceMetricSource.`target`(block: v2_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = v2_MetricTarget()
  }

  this.`target`.block()
}

