// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ContainerResourceMetricStatus as v2beta1_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricStatus as v2beta1_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.PodsMetricStatus as v2beta1_PodsMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ResourceMetricStatus as v2beta1_ResourceMetricStatus


fun  v2beta1_ContainerResourceMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  v2beta1_ExternalMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  v2beta1_PodsMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}


fun  v2beta1_ResourceMetricStatus.`currentAverageValue`(block: model_Quantity.() -> Unit = {}) {
  if(this.`currentAverageValue` == null) {
    this.`currentAverageValue` = model_Quantity()
  }

  this.`currentAverageValue`.block()
}

