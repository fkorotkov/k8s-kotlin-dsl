// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.KubernetesResource as model_KubernetesResource
import io.fabric8.kubernetes.api.model.MetricSpec as model_MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus as model_MetricStatus
import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus as model_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.WatchEvent as model_WatchEvent


fun  model_MetricSpec.`object`(block: model_ObjectMetricSource.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = model_ObjectMetricSource()
  }

  this.`object`.block()
}


fun  model_MetricStatus.`object`(block: model_ObjectMetricStatus.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = model_ObjectMetricStatus()
  }

  this.`object`.block()
}


fun  model_WatchEvent.`object`(block: model_KubernetesResource.() -> Unit = {}) {
  this.`object`.block()
}

