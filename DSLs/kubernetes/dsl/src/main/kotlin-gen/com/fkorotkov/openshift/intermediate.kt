// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IntermediateTLSProfile as model_IntermediateTLSProfile
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile


fun  model_TLSSecurityProfile.`intermediate`(block: model_IntermediateTLSProfile.() -> Unit = {}) {
  if(this.`intermediate` == null) {
    this.`intermediate` = model_IntermediateTLSProfile()
  }

  this.`intermediate`.block()
}

