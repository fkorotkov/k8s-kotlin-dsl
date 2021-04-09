// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LDAPIdentityProvider as model_LDAPIdentityProvider
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_LDAPIdentityProvider.`bindPassword`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`bindPassword` == null) {
    this.`bindPassword` = model_SecretNameReference()
  }

  this.`bindPassword`.block()
}

