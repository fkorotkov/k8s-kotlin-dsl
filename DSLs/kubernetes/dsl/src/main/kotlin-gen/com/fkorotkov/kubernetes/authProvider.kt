// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig as model_AuthProviderConfig


fun  model_AuthInfo.`authProvider`(block: model_AuthProviderConfig.() -> Unit = {}) {
  if(this.`authProvider` == null) {
    this.`authProvider` = model_AuthProviderConfig()
  }

  this.`authProvider`.block()
}

