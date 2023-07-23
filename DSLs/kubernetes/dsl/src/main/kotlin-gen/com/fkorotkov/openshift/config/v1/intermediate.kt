// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IntermediateTLSProfile as v1_IntermediateTLSProfile
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile


fun  v1_TLSSecurityProfile.`intermediate`(block: v1_IntermediateTLSProfile.() -> Unit = {}) {
  if(this.`intermediate` == null) {
    this.`intermediate` = v1_IntermediateTLSProfile()
  }

  this.`intermediate`.block()
}

