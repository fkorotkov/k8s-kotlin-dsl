// GENERATE
package com.fkorotkov.kubernetes.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ContainerResourceMetricSource as v2beta2_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ContainerResourceMetricStatus as v2beta2_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.CrossVersionObjectReference as v2beta2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricSource as v2beta2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricStatus as v2beta2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HPAScalingPolicy as v2beta2_HPAScalingPolicy
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HPAScalingRules as v2beta2_HPAScalingRules
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscaler as v2beta2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerBehavior as v2beta2_HorizontalPodAutoscalerBehavior
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerCondition as v2beta2_HorizontalPodAutoscalerCondition
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerList as v2beta2_HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerSpec as v2beta2_HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerStatus as v2beta2_HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricIdentifier as v2beta2_MetricIdentifier
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricTarget as v2beta2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricValueStatus as v2beta2_MetricValueStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricSource as v2beta2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricStatus as v2beta2_ObjectMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricSource as v2beta2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.PodsMetricStatus as v2beta2_PodsMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricSource as v2beta2_ResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricStatus as v2beta2_ResourceMetricStatus


fun newContainerResourceMetricSource(block : v2beta2_ContainerResourceMetricSource.() -> Unit = {}): v2beta2_ContainerResourceMetricSource {
  val instance = v2beta2_ContainerResourceMetricSource()
  instance.block()
  return instance
}


fun newContainerResourceMetricStatus(block : v2beta2_ContainerResourceMetricStatus.() -> Unit = {}): v2beta2_ContainerResourceMetricStatus {
  val instance = v2beta2_ContainerResourceMetricStatus()
  instance.block()
  return instance
}


fun newCrossVersionObjectReference(block : v2beta2_CrossVersionObjectReference.() -> Unit = {}): v2beta2_CrossVersionObjectReference {
  val instance = v2beta2_CrossVersionObjectReference()
  instance.block()
  return instance
}


fun newExternalMetricSource(block : v2beta2_ExternalMetricSource.() -> Unit = {}): v2beta2_ExternalMetricSource {
  val instance = v2beta2_ExternalMetricSource()
  instance.block()
  return instance
}


fun newExternalMetricStatus(block : v2beta2_ExternalMetricStatus.() -> Unit = {}): v2beta2_ExternalMetricStatus {
  val instance = v2beta2_ExternalMetricStatus()
  instance.block()
  return instance
}


fun newHPAScalingPolicy(block : v2beta2_HPAScalingPolicy.() -> Unit = {}): v2beta2_HPAScalingPolicy {
  val instance = v2beta2_HPAScalingPolicy()
  instance.block()
  return instance
}


fun newHPAScalingRules(block : v2beta2_HPAScalingRules.() -> Unit = {}): v2beta2_HPAScalingRules {
  val instance = v2beta2_HPAScalingRules()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscaler(block : v2beta2_HorizontalPodAutoscaler.() -> Unit = {}): v2beta2_HorizontalPodAutoscaler {
  val instance = v2beta2_HorizontalPodAutoscaler()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerBehavior(block : v2beta2_HorizontalPodAutoscalerBehavior.() -> Unit = {}): v2beta2_HorizontalPodAutoscalerBehavior {
  val instance = v2beta2_HorizontalPodAutoscalerBehavior()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerCondition(block : v2beta2_HorizontalPodAutoscalerCondition.() -> Unit = {}): v2beta2_HorizontalPodAutoscalerCondition {
  val instance = v2beta2_HorizontalPodAutoscalerCondition()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerList(block : v2beta2_HorizontalPodAutoscalerList.() -> Unit = {}): v2beta2_HorizontalPodAutoscalerList {
  val instance = v2beta2_HorizontalPodAutoscalerList()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerSpec(block : v2beta2_HorizontalPodAutoscalerSpec.() -> Unit = {}): v2beta2_HorizontalPodAutoscalerSpec {
  val instance = v2beta2_HorizontalPodAutoscalerSpec()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerStatus(block : v2beta2_HorizontalPodAutoscalerStatus.() -> Unit = {}): v2beta2_HorizontalPodAutoscalerStatus {
  val instance = v2beta2_HorizontalPodAutoscalerStatus()
  instance.block()
  return instance
}


fun newMetricIdentifier(block : v2beta2_MetricIdentifier.() -> Unit = {}): v2beta2_MetricIdentifier {
  val instance = v2beta2_MetricIdentifier()
  instance.block()
  return instance
}


fun newMetricSpec(block : v2beta2_MetricSpec.() -> Unit = {}): v2beta2_MetricSpec {
  val instance = v2beta2_MetricSpec()
  instance.block()
  return instance
}


fun newMetricStatus(block : v2beta2_MetricStatus.() -> Unit = {}): v2beta2_MetricStatus {
  val instance = v2beta2_MetricStatus()
  instance.block()
  return instance
}


fun newMetricTarget(block : v2beta2_MetricTarget.() -> Unit = {}): v2beta2_MetricTarget {
  val instance = v2beta2_MetricTarget()
  instance.block()
  return instance
}


fun newMetricValueStatus(block : v2beta2_MetricValueStatus.() -> Unit = {}): v2beta2_MetricValueStatus {
  val instance = v2beta2_MetricValueStatus()
  instance.block()
  return instance
}


fun newObjectMetricSource(block : v2beta2_ObjectMetricSource.() -> Unit = {}): v2beta2_ObjectMetricSource {
  val instance = v2beta2_ObjectMetricSource()
  instance.block()
  return instance
}


fun newObjectMetricStatus(block : v2beta2_ObjectMetricStatus.() -> Unit = {}): v2beta2_ObjectMetricStatus {
  val instance = v2beta2_ObjectMetricStatus()
  instance.block()
  return instance
}


fun newPodsMetricSource(block : v2beta2_PodsMetricSource.() -> Unit = {}): v2beta2_PodsMetricSource {
  val instance = v2beta2_PodsMetricSource()
  instance.block()
  return instance
}


fun newPodsMetricStatus(block : v2beta2_PodsMetricStatus.() -> Unit = {}): v2beta2_PodsMetricStatus {
  val instance = v2beta2_PodsMetricStatus()
  instance.block()
  return instance
}


fun newResourceMetricSource(block : v2beta2_ResourceMetricSource.() -> Unit = {}): v2beta2_ResourceMetricSource {
  val instance = v2beta2_ResourceMetricSource()
  instance.block()
  return instance
}


fun newResourceMetricStatus(block : v2beta2_ResourceMetricStatus.() -> Unit = {}): v2beta2_ResourceMetricStatus {
  val instance = v2beta2_ResourceMetricStatus()
  instance.block()
  return instance
}

