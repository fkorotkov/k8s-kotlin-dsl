// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.RequestHeaderIdentityProvider as model_RequestHeaderIdentityProvider


fun  model_IdentityProvider.`requestHeader`(block: model_RequestHeaderIdentityProvider.() -> Unit = {}) {
  if(this.`requestHeader` == null) {
    this.`requestHeader` = model_RequestHeaderIdentityProvider()
  }

  this.`requestHeader`.block()
}

