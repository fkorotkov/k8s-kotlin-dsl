// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BasicAuthIdentityProvider as model_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.KeystoneIdentityProvider as model_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_BasicAuthIdentityProvider.`tlsClientKey`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientKey` == null) {
    this.`tlsClientKey` = model_SecretNameReference()
  }

  this.`tlsClientKey`.block()
}


fun  model_KeystoneIdentityProvider.`tlsClientKey`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientKey` == null) {
    this.`tlsClientKey` = model_SecretNameReference()
  }

  this.`tlsClientKey`.block()
}

