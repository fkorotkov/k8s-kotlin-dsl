// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricSource as v2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricStatus as v2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricIdentifier as v2_MetricIdentifier
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricSource as v2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricStatus as v2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricSource as v2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricStatus as v2_PodsMetricStatus


fun  v2_ExternalMetricSource.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2_ExternalMetricStatus.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2_ObjectMetricSource.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2_ObjectMetricStatus.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2_PodsMetricSource.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2_PodsMetricStatus.`metric`(block: v2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2_MetricIdentifier()
  }

  this.`metric`.block()
}

