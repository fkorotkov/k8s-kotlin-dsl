// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GroupVersionResource
import io.fabric8.kubernetes.api.model.MetricSpec
import io.fabric8.kubernetes.api.model.MetricStatus
import io.fabric8.kubernetes.api.model.ResourceMetricSource
import io.fabric8.kubernetes.api.model.ResourceMetricStatus
import io.fabric8.kubernetes.api.model.admission.AdmissionRequest


fun  AdmissionRequest.`resource`(block: GroupVersionResource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = GroupVersionResource()
  }

  this.`resource`.block()
}


fun  MetricSpec.`resource`(block: ResourceMetricSource.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = ResourceMetricSource()
  }

  this.`resource`.block()
}


fun  MetricStatus.`resource`(block: ResourceMetricStatus.() -> Unit = {}) {
  if(this.`resource` == null) {
    this.`resource` = ResourceMetricStatus()
  }

  this.`resource`.block()
}

