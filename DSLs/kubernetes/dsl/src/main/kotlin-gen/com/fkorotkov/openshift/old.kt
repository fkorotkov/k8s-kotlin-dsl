// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OldTLSProfile as model_OldTLSProfile
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile


fun  model_TLSSecurityProfile.`old`(block: model_OldTLSProfile.() -> Unit = {}) {
  if(this.`old` == null) {
    this.`old` = model_OldTLSProfile()
  }

  this.`old`.block()
}

