// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OldTLSProfile as v1_OldTLSProfile
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile


fun  v1_TLSSecurityProfile.`old`(block: v1_OldTLSProfile.() -> Unit = {}) {
  if(this.`old` == null) {
    this.`old` = v1_OldTLSProfile()
  }

  this.`old`.block()
}

