// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenIDClaims as model_OpenIDClaims
import io.fabric8.openshift.api.model.OpenIDIdentityProvider as model_OpenIDIdentityProvider


fun  model_OpenIDIdentityProvider.`claims`(block: model_OpenIDClaims.() -> Unit = {}) {
  if(this.`claims` == null) {
    this.`claims` = model_OpenIDClaims()
  }

  this.`claims`.block()
}

