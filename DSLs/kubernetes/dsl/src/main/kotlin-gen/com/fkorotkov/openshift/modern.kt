// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ModernTLSProfile as model_ModernTLSProfile
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile


fun  model_TLSSecurityProfile.`modern`(block: model_ModernTLSProfile.() -> Unit = {}) {
  if(this.`modern` == null) {
    this.`modern` = model_ModernTLSProfile()
  }

  this.`modern`.block()
}

