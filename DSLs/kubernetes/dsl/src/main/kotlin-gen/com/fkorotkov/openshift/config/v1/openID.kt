// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider
import io.fabric8.openshift.api.model.config.v1.OpenIDIdentityProvider as v1_OpenIDIdentityProvider


fun  v1_IdentityProvider.`openID`(block: v1_OpenIDIdentityProvider.() -> Unit = {}) {
  if(this.`openID` == null) {
    this.`openID` = v1_OpenIDIdentityProvider()
  }

  this.`openID`.block()
}

