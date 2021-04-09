// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ContainerResourceMetricSource as v2beta1_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ContainerResourceMetricStatus as v2beta1_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus


fun  v2beta1_MetricSpec.`containerResource`(block: v2beta1_ContainerResourceMetricSource.() -> Unit = {}) {
  if(this.`containerResource` == null) {
    this.`containerResource` = v2beta1_ContainerResourceMetricSource()
  }

  this.`containerResource`.block()
}


fun  v2beta1_MetricStatus.`containerResource`(block: v2beta1_ContainerResourceMetricStatus.() -> Unit = {}) {
  if(this.`containerResource` == null) {
    this.`containerResource` = v2beta1_ContainerResourceMetricStatus()
  }

  this.`containerResource`.block()
}

