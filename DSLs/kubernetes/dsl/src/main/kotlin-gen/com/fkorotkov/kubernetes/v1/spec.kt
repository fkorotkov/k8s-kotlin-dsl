// GENERATED
package com.fkorotkov.kubernetes.v1

import io.fabric8.kubernetes.api.model.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.v1.ScaleSpec as v1_ScaleSpec


fun  v1_Scale.`spec`(block: v1_ScaleSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ScaleSpec()
  }

  this.`spec`.block()
}

