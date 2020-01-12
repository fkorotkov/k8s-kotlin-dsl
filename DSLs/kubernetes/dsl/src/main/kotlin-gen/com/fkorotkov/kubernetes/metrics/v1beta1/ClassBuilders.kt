// GENERATE
package com.fkorotkov.kubernetes.metrics.v1beta1

import io.fabric8.kubernetes.api.model.metrics.v1beta1.ContainerMetrics as v1beta1_ContainerMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.NodeMetrics as v1beta1_NodeMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.NodeMetricsList as v1beta1_NodeMetricsList
import io.fabric8.kubernetes.api.model.metrics.v1beta1.PodMetrics as v1beta1_PodMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.PodMetricsList as v1beta1_PodMetricsList


fun newContainerMetrics(block : v1beta1_ContainerMetrics.() -> Unit = {}): v1beta1_ContainerMetrics {
  val instance = v1beta1_ContainerMetrics()
  instance.block()
  return instance
}


fun newNodeMetrics(block : v1beta1_NodeMetrics.() -> Unit = {}): v1beta1_NodeMetrics {
  val instance = v1beta1_NodeMetrics()
  instance.block()
  return instance
}


fun newNodeMetricsList(block : v1beta1_NodeMetricsList.() -> Unit = {}): v1beta1_NodeMetricsList {
  val instance = v1beta1_NodeMetricsList()
  instance.block()
  return instance
}


fun newPodMetrics(block : v1beta1_PodMetrics.() -> Unit = {}): v1beta1_PodMetrics {
  val instance = v1beta1_PodMetrics()
  instance.block()
  return instance
}


fun newPodMetricsList(block : v1beta1_PodMetricsList.() -> Unit = {}): v1beta1_PodMetricsList {
  val instance = v1beta1_PodMetricsList()
  instance.block()
  return instance
}

