// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.GoogleIdentityProvider as v1_GoogleIdentityProvider
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider


fun  v1_IdentityProvider.`google`(block: v1_GoogleIdentityProvider.() -> Unit = {}) {
  if(this.`google` == null) {
    this.`google` = v1_GoogleIdentityProvider()
  }

  this.`google`.block()
}

