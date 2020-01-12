// GENERATED
package com.fkorotkov.kubernetes.coordination.v1beta1

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.coordination.v1beta1.LeaseSpec as v1beta1_LeaseSpec


fun  v1beta1_LeaseSpec.`acquireTime`(block: model_MicroTime.() -> Unit = {}) {
  if(this.`acquireTime` == null) {
    this.`acquireTime` = model_MicroTime()
  }

  this.`acquireTime`.block()
}

