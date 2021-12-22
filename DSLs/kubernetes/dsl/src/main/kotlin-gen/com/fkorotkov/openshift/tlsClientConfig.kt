// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.SecretNameReference as model_SecretNameReference


fun  model_ConnectionConfig.`tlsClientConfig`(block: model_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientConfig` == null) {
    this.`tlsClientConfig` = model_SecretNameReference()
  }

  this.`tlsClientConfig`.block()
}

