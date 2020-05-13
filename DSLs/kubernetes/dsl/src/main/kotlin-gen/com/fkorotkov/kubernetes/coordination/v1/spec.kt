// GENERATED
package com.fkorotkov.kubernetes.coordination.v1

import io.fabric8.kubernetes.api.model.coordination.v1.Lease as v1_Lease
import io.fabric8.kubernetes.api.model.coordination.v1.LeaseSpec as v1_LeaseSpec


fun  v1_Lease.`spec`(block: v1_LeaseSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_LeaseSpec()
  }

  this.`spec`.block()
}

