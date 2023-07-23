// GENERATE
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricSource as v2_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ContainerResourceMetricStatus as v2_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.CrossVersionObjectReference as v2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricSource as v2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ExternalMetricStatus as v2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.HPAScalingPolicy as v2_HPAScalingPolicy
import io.fabric8.kubernetes.api.model.autoscaling.v2.HPAScalingRules as v2_HPAScalingRules
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscaler as v2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerBehavior as v2_HorizontalPodAutoscalerBehavior
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerCondition as v2_HorizontalPodAutoscalerCondition
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerList as v2_HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerSpec as v2_HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerStatus as v2_HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricIdentifier as v2_MetricIdentifier
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricTarget as v2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricValueStatus as v2_MetricValueStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricSource as v2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ObjectMetricStatus as v2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricSource as v2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricStatus as v2_PodsMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricSource as v2_ResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricStatus as v2_ResourceMetricStatus


fun newContainerResourceMetricSource(block : v2_ContainerResourceMetricSource.() -> Unit = {}): v2_ContainerResourceMetricSource {
  val instance = v2_ContainerResourceMetricSource()
  instance.block()
  return instance
}


fun newContainerResourceMetricStatus(block : v2_ContainerResourceMetricStatus.() -> Unit = {}): v2_ContainerResourceMetricStatus {
  val instance = v2_ContainerResourceMetricStatus()
  instance.block()
  return instance
}


fun newCrossVersionObjectReference(block : v2_CrossVersionObjectReference.() -> Unit = {}): v2_CrossVersionObjectReference {
  val instance = v2_CrossVersionObjectReference()
  instance.block()
  return instance
}


fun newExternalMetricSource(block : v2_ExternalMetricSource.() -> Unit = {}): v2_ExternalMetricSource {
  val instance = v2_ExternalMetricSource()
  instance.block()
  return instance
}


fun newExternalMetricStatus(block : v2_ExternalMetricStatus.() -> Unit = {}): v2_ExternalMetricStatus {
  val instance = v2_ExternalMetricStatus()
  instance.block()
  return instance
}


fun newHPAScalingPolicy(block : v2_HPAScalingPolicy.() -> Unit = {}): v2_HPAScalingPolicy {
  val instance = v2_HPAScalingPolicy()
  instance.block()
  return instance
}


fun newHPAScalingRules(block : v2_HPAScalingRules.() -> Unit = {}): v2_HPAScalingRules {
  val instance = v2_HPAScalingRules()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscaler(block : v2_HorizontalPodAutoscaler.() -> Unit = {}): v2_HorizontalPodAutoscaler {
  val instance = v2_HorizontalPodAutoscaler()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerBehavior(block : v2_HorizontalPodAutoscalerBehavior.() -> Unit = {}): v2_HorizontalPodAutoscalerBehavior {
  val instance = v2_HorizontalPodAutoscalerBehavior()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerCondition(block : v2_HorizontalPodAutoscalerCondition.() -> Unit = {}): v2_HorizontalPodAutoscalerCondition {
  val instance = v2_HorizontalPodAutoscalerCondition()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerList(block : v2_HorizontalPodAutoscalerList.() -> Unit = {}): v2_HorizontalPodAutoscalerList {
  val instance = v2_HorizontalPodAutoscalerList()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerSpec(block : v2_HorizontalPodAutoscalerSpec.() -> Unit = {}): v2_HorizontalPodAutoscalerSpec {
  val instance = v2_HorizontalPodAutoscalerSpec()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerStatus(block : v2_HorizontalPodAutoscalerStatus.() -> Unit = {}): v2_HorizontalPodAutoscalerStatus {
  val instance = v2_HorizontalPodAutoscalerStatus()
  instance.block()
  return instance
}


fun newMetricIdentifier(block : v2_MetricIdentifier.() -> Unit = {}): v2_MetricIdentifier {
  val instance = v2_MetricIdentifier()
  instance.block()
  return instance
}


fun newMetricSpec(block : v2_MetricSpec.() -> Unit = {}): v2_MetricSpec {
  val instance = v2_MetricSpec()
  instance.block()
  return instance
}


fun newMetricStatus(block : v2_MetricStatus.() -> Unit = {}): v2_MetricStatus {
  val instance = v2_MetricStatus()
  instance.block()
  return instance
}


fun newMetricTarget(block : v2_MetricTarget.() -> Unit = {}): v2_MetricTarget {
  val instance = v2_MetricTarget()
  instance.block()
  return instance
}


fun newMetricValueStatus(block : v2_MetricValueStatus.() -> Unit = {}): v2_MetricValueStatus {
  val instance = v2_MetricValueStatus()
  instance.block()
  return instance
}


fun newObjectMetricSource(block : v2_ObjectMetricSource.() -> Unit = {}): v2_ObjectMetricSource {
  val instance = v2_ObjectMetricSource()
  instance.block()
  return instance
}


fun newObjectMetricStatus(block : v2_ObjectMetricStatus.() -> Unit = {}): v2_ObjectMetricStatus {
  val instance = v2_ObjectMetricStatus()
  instance.block()
  return instance
}


fun newPodsMetricSource(block : v2_PodsMetricSource.() -> Unit = {}): v2_PodsMetricSource {
  val instance = v2_PodsMetricSource()
  instance.block()
  return instance
}


fun newPodsMetricStatus(block : v2_PodsMetricStatus.() -> Unit = {}): v2_PodsMetricStatus {
  val instance = v2_PodsMetricStatus()
  instance.block()
  return instance
}


fun newResourceMetricSource(block : v2_ResourceMetricSource.() -> Unit = {}): v2_ResourceMetricSource {
  val instance = v2_ResourceMetricSource()
  instance.block()
  return instance
}


fun newResourceMetricStatus(block : v2_ResourceMetricStatus.() -> Unit = {}): v2_ResourceMetricStatus {
  val instance = v2_ResourceMetricStatus()
  instance.block()
  return instance
}

