// GENERATED
package com.fkorotkov.kubernetes.coordination.v1beta1

import io.fabric8.kubernetes.api.model.coordination.v1beta1.Lease as v1beta1_Lease
import io.fabric8.kubernetes.api.model.coordination.v1beta1.LeaseSpec as v1beta1_LeaseSpec


fun  v1beta1_Lease.`spec`(block: v1beta1_LeaseSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_LeaseSpec()
  }

  this.`spec`.block()
}

