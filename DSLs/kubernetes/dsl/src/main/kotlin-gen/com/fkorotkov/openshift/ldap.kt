// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.LDAPIdentityProvider as model_LDAPIdentityProvider


fun  model_IdentityProvider.`ldap`(block: model_LDAPIdentityProvider.() -> Unit = {}) {
  if(this.`ldap` == null) {
    this.`ldap` = model_LDAPIdentityProvider()
  }

  this.`ldap`.block()
}

