// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.config.v1.SecretNameReference as v1_SecretNameReference


fun  model_ConnectionConfig.`tlsClientConfig`(block: v1_SecretNameReference.() -> Unit = {}) {
  if(this.`tlsClientConfig` == null) {
    this.`tlsClientConfig` = v1_SecretNameReference()
  }

  this.`tlsClientConfig`.block()
}

