// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.HTPasswdIdentityProvider as model_HTPasswdIdentityProvider
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_HTPasswdIdentityProvider.`fileData`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`fileData` == null) {
    this.`fileData` = model_SecretNameReference()
  }

  this.`fileData`.block()
}

