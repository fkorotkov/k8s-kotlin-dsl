// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HasMetadata
import io.fabric8.kubernetes.api.model.KubernetesResource
import io.fabric8.kubernetes.api.model.MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus
import io.fabric8.kubernetes.api.model.ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectMetricStatus
import io.fabric8.kubernetes.api.model.WatchEvent
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest


fun  AdmissionRequest.`object`(block: HasMetadata.() -> Unit = {}) {
  this.`object`.block()
}


fun  MetricSpec.`object`(block: ObjectMetricSource.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = ObjectMetricSource()
  }

  this.`object`.block()
}


fun  MetricStatus.`object`(block: ObjectMetricStatus.() -> Unit = {}) {
  if(this.`object` == null) {
    this.`object` = ObjectMetricStatus()
  }

  this.`object`.block()
}


fun  WatchEvent.`object`(block: KubernetesResource<*>.() -> Unit = {}) {
  this.`object`.block()
}

