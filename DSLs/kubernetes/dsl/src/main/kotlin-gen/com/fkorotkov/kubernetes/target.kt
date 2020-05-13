// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.ExternalMetricSource as model_ExternalMetricSource
import io.fabric8.kubernetes.api.model.MetricTarget as model_MetricTarget
import io.fabric8.kubernetes.api.model.ObjectMetricSource as model_ObjectMetricSource
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.PodsMetricSource as model_PodsMetricSource
import io.fabric8.kubernetes.api.model.ResourceMetricSource as model_ResourceMetricSource


fun  model_Binding.`target`(block: model_ObjectReference.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_ObjectReference()
  }

  this.`target`.block()
}


fun  model_ExternalMetricSource.`target`(block: model_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_MetricTarget()
  }

  this.`target`.block()
}


fun  model_ObjectMetricSource.`target`(block: model_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_MetricTarget()
  }

  this.`target`.block()
}


fun  model_PodsMetricSource.`target`(block: model_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_MetricTarget()
  }

  this.`target`.block()
}


fun  model_ResourceMetricSource.`target`(block: model_MetricTarget.() -> Unit = {}) {
  if(this.`target` == null) {
    this.`target` = model_MetricTarget()
  }

  this.`target`.block()
}

