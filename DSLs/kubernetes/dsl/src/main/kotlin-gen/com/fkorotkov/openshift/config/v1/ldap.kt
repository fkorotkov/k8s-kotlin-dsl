// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.IdentityProvider as v1_IdentityProvider
import io.fabric8.openshift.api.model.config.v1.LDAPIdentityProvider as v1_LDAPIdentityProvider


fun  v1_IdentityProvider.`ldap`(block: v1_LDAPIdentityProvider.() -> Unit = {}) {
  if(this.`ldap` == null) {
    this.`ldap` = v1_LDAPIdentityProvider()
  }

  this.`ldap`.block()
}

