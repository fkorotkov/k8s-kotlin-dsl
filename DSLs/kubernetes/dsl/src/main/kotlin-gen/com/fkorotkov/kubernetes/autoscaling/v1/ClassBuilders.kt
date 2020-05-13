// GENERATE
package com.fkorotkov.kubernetes.autoscaling.v1

import io.fabric8.kubernetes.api.model.autoscaling.v1.CrossVersionObjectReference as v1_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscaler as v1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerList as v1_HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerSpec as v1_HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerStatus as v1_HorizontalPodAutoscalerStatus
import io.fabric8.kubernetes.api.model.autoscaling.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.autoscaling.v1.ScaleSpec as v1_ScaleSpec
import io.fabric8.kubernetes.api.model.autoscaling.v1.ScaleStatus as v1_ScaleStatus


fun newCrossVersionObjectReference(block : v1_CrossVersionObjectReference.() -> Unit = {}): v1_CrossVersionObjectReference {
  val instance = v1_CrossVersionObjectReference()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscaler(block : v1_HorizontalPodAutoscaler.() -> Unit = {}): v1_HorizontalPodAutoscaler {
  val instance = v1_HorizontalPodAutoscaler()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerList(block : v1_HorizontalPodAutoscalerList.() -> Unit = {}): v1_HorizontalPodAutoscalerList {
  val instance = v1_HorizontalPodAutoscalerList()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerSpec(block : v1_HorizontalPodAutoscalerSpec.() -> Unit = {}): v1_HorizontalPodAutoscalerSpec {
  val instance = v1_HorizontalPodAutoscalerSpec()
  instance.block()
  return instance
}


fun newHorizontalPodAutoscalerStatus(block : v1_HorizontalPodAutoscalerStatus.() -> Unit = {}): v1_HorizontalPodAutoscalerStatus {
  val instance = v1_HorizontalPodAutoscalerStatus()
  instance.block()
  return instance
}


fun newScale(block : v1_Scale.() -> Unit = {}): v1_Scale {
  val instance = v1_Scale()
  instance.block()
  return instance
}


fun newScaleSpec(block : v1_ScaleSpec.() -> Unit = {}): v1_ScaleSpec {
  val instance = v1_ScaleSpec()
  instance.block()
  return instance
}


fun newScaleStatus(block : v1_ScaleStatus.() -> Unit = {}): v1_ScaleStatus {
  val instance = v1_ScaleStatus()
  instance.block()
  return instance
}

