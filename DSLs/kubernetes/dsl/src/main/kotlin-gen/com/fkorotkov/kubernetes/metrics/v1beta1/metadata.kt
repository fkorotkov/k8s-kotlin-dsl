// GENERATED
package com.fkorotkov.kubernetes.metrics.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.metrics.v1beta1.NodeMetrics as v1beta1_NodeMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.NodeMetricsList as v1beta1_NodeMetricsList
import io.fabric8.kubernetes.api.model.metrics.v1beta1.PodMetrics as v1beta1_PodMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.PodMetricsList as v1beta1_PodMetricsList


fun  v1beta1_NodeMetrics.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_NodeMetricsList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_PodMetrics.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1beta1_PodMetricsList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

