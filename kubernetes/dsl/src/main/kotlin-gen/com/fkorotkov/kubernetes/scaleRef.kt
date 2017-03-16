// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.extensions.SubresourceReference


fun  HorizontalPodAutoscalerSpec.`scaleRef`(block: SubresourceReference.() -> Unit = {}) {
  if(this.`scaleRef` == null) {
    this.`scaleRef` = SubresourceReference()
  }

  this.`scaleRef`.block()
}

