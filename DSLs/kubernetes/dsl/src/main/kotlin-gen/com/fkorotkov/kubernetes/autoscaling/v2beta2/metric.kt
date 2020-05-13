// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricSource as v2beta2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricStatus as v2beta2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricIdentifier as v2beta2_MetricIdentifier
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricSource as v2beta2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricStatus as v2beta2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricSource as v2beta2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricStatus as v2beta2_PodsMetricStatus


fun  v2beta2_ExternalMetricSource.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2beta2_ExternalMetricStatus.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2beta2_ObjectMetricSource.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2beta2_ObjectMetricStatus.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2beta2_PodsMetricSource.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}


fun  v2beta2_PodsMetricStatus.`metric`(block: v2beta2_MetricIdentifier.() -> Unit = {}) {
  if(this.`metric` == null) {
    this.`metric` = v2beta2_MetricIdentifier()
  }

  this.`metric`.block()
}

