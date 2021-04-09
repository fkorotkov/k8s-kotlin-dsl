// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.APIServerSpec as model_APIServerSpec
import io.fabric8.openshift.api.model.TLSSecurityProfile as model_TLSSecurityProfile


fun  model_APIServerSpec.`tlsSecurityProfile`(block: model_TLSSecurityProfile.() -> Unit = {}) {
  if(this.`tlsSecurityProfile` == null) {
    this.`tlsSecurityProfile` = model_TLSSecurityProfile()
  }

  this.`tlsSecurityProfile`.block()
}

