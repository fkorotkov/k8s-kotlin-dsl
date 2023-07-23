// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.LDAPIdentityProvider as v1_LDAPIdentityProvider
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_LDAPIdentityProvider.`bindPassword`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`bindPassword` == null) {
    this.`bindPassword` = v1_SecretNameReference()
  }

  this.`bindPassword`.block()
}

