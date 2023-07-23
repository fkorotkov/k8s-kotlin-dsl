// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BasicAuthIdentityProvider as v1_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.config.v1.KeystoneIdentityProvider as v1_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_BasicAuthIdentityProvider.`tlsClientKey`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientKey` == null) {
    this.`tlsClientKey` = v1_SecretNameReference()
  }

  this.`tlsClientKey`.block()
}


fun  v1_KeystoneIdentityProvider.`tlsClientKey`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientKey` == null) {
    this.`tlsClientKey` = v1_SecretNameReference()
  }

  this.`tlsClientKey`.block()
}

