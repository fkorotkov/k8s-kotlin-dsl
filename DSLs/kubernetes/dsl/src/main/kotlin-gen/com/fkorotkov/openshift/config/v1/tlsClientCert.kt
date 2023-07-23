// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.BasicAuthIdentityProvider as v1_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.config.v1.KeystoneIdentityProvider as v1_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  v1_BasicAuthIdentityProvider.`tlsClientCert`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientCert` == null) {
    this.`tlsClientCert` = v1_SecretNameReference()
  }

  this.`tlsClientCert`.block()
}


fun  v1_KeystoneIdentityProvider.`tlsClientCert`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientCert` == null) {
    this.`tlsClientCert` = v1_SecretNameReference()
  }

  this.`tlsClientCert`.block()
}

