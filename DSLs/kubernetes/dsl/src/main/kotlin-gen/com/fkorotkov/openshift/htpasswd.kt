// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.HTPasswdIdentityProvider as model_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider


fun  model_IdentityProvider.`htpasswd`(block: model_HTPasswdIdentityProvider.() -> Unit = {}) {
  if(this.`htpasswd` == null) {
    this.`htpasswd` = model_HTPasswdIdentityProvider()
  }

  this.`htpasswd`.block()
}

