// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ModernTLSProfile as v1_ModernTLSProfile
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile


fun  v1_TLSSecurityProfile.`modern`(block: v1_ModernTLSProfile.() -> Unit = {}) {
  if(this.`modern` == null) {
    this.`modern` = v1_ModernTLSProfile()
  }

  this.`modern`.block()
}

