// GENERATED
package com.fkorotkov.kubernetes.v1

import io.fabric8.kubernetes.api.model.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.v1.ScaleStatus as v1_ScaleStatus


fun  v1_Scale.`status`(block: v1_ScaleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ScaleStatus()
  }

  this.`status`.block()
}

