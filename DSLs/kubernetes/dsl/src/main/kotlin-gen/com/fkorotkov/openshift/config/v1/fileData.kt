// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.HTPasswdIdentityProvider as v1_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_HTPasswdIdentityProvider.`fileData`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`fileData` == null) {
    this.`fileData` = v1_SecretNameReference()
  }

  this.`fileData`.block()
}

