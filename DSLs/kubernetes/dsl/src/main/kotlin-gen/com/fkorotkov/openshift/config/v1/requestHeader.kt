// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider
import io.fabric8.openshift.api.model.config.v1.RequestHeaderIdentityProvider as v1_RequestHeaderIdentityProvider


fun  v1_IdentityProvider.`requestHeader`(block: v1_RequestHeaderIdentityProvider.() -> Unit = {}) {
  if(this.`requestHeader` == null) {
    this.`requestHeader` = v1_RequestHeaderIdentityProvider()
  }

  this.`requestHeader`.block()
}

