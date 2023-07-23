// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OpenIDClaims as v1_OpenIDClaims
import io.fabric8.openshift.api.model.config.v1.OpenIDIdentityProvider as v1_OpenIDIdentityProvider


fun  v1_OpenIDIdentityProvider.`claims`(block: v1_OpenIDClaims.() -> Unit = {}) {
  if(this.`claims` == null) {
    this.`claims` = v1_OpenIDClaims()
  }

  this.`claims`.block()
}

