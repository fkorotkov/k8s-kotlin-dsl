// GENERATED
package com.fkorotkov.kubernetes.autoscaling.v2

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricIdentifier as v2_MetricIdentifier


fun  v2_MetricIdentifier.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}

