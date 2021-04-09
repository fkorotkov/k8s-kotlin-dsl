// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BasicAuthIdentityProvider as model_BasicAuthIdentityProvider
import io.fabric8.openshift.api.model.KeystoneIdentityProvider as model_KeystoneIdentityProvider
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_BasicAuthIdentityProvider.`tlsClientCert`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientCert` == null) {
    this.`tlsClientCert` = model_SecretNameReference()
  }

  this.`tlsClientCert`.block()
}


fun  model_KeystoneIdentityProvider.`tlsClientCert`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientCert` == null) {
    this.`tlsClientCert` = model_SecretNameReference()
  }

  this.`tlsClientCert`.block()
}

