// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BasicAuthIdentityProvider as v1_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider


fun  v1_IdentityProvider.`basicAuth`(block: v1_BasicAuthIdentityProvider.() -> Unit = {}) {
  if(this.`basicAuth` == null) {
    this.`basicAuth` = v1_BasicAuthIdentityProvider()
  }

  this.`basicAuth`.block()
}

