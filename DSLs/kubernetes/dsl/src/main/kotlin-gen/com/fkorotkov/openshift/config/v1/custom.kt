// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.CustomTLSProfile as v1_CustomTLSProfile
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile


fun  v1_TLSSecurityProfile.`custom`(block: v1_CustomTLSProfile.() -> Unit = {}) {
  if(this.`custom` == null) {
    this.`custom` = v1_CustomTLSProfile()
  }

  this.`custom`.block()
}

