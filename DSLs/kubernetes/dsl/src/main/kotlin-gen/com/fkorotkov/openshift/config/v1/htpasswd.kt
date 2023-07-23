// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.HTPasswdIdentityProvider as v1_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider


fun  v1_IdentityProvider.`htpasswd`(block: v1_HTPasswdIdentityProvider.() -> Unit = {}) {
  if(this.`htpasswd` == null) {
    this.`htpasswd` = v1_HTPasswdIdentityProvider()
  }

  this.`htpasswd`.block()
}

