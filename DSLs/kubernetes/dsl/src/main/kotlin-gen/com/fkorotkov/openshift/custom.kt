// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.CustomTLSProfile as model_CustomTLSProfile
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile


fun  model_TLSSecurityProfile.`custom`(block: model_CustomTLSProfile.() -> Unit = {}) {
  if(this.`custom` == null) {
    this.`custom` = model_CustomTLSProfile()
  }

  this.`custom`.block()
}

