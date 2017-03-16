// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.CPUTargetUtilization
import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerSpec


fun  HorizontalPodAutoscalerSpec.`cpuUtilization`(block: CPUTargetUtilization.() -> Unit = {}) {
  if(this.`cpuUtilization` == null) {
    this.`cpuUtilization` = CPUTargetUtilization()
  }

  this.`cpuUtilization`.block()
}

