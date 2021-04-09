// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.KeystoneIdentityProvider as model_KeystoneIdentityProvider


fun  model_IdentityProvider.`keystone`(block: model_KeystoneIdentityProvider.() -> Unit = {}) {
  if(this.`keystone` == null) {
    this.`keystone` = model_KeystoneIdentityProvider()
  }

  this.`keystone`.block()
}

