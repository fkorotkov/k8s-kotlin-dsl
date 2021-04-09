// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.OpenIDIdentityProvider as model_OpenIDIdentityProvider


fun  model_IdentityProvider.`openID`(block: model_OpenIDIdentityProvider.() -> Unit = {}) {
  if(this.`openID` == null) {
    this.`openID` = model_OpenIDIdentityProvider()
  }

  this.`openID`.block()
}

