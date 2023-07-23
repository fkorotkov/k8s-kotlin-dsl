// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec
import io.fabric8.openshift.api.model.config.v1.TLSSecurityProfile as v1_TLSSecurityProfile


fun  v1_APIServerSpec.`tlsSecurityProfile`(block: v1_TLSSecurityProfile.() -> Unit = {}) {
  if(this.`tlsSecurityProfile` == null) {
    this.`tlsSecurityProfile` = v1_TLSSecurityProfile()
  }

  this.`tlsSecurityProfile`.block()
}

