// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider
import io.fabric8.openshift.api.model.config.v1.KeystoneIdentityProvider as v1_KeystoneIdentityProvider


fun  v1_IdentityProvider.`keystone`(block: v1_KeystoneIdentityProvider.() -> Unit = {}) {
  if(this.`keystone` == null) {
    this.`keystone` = v1_KeystoneIdentityProvider()
  }

  this.`keystone`.block()
}

