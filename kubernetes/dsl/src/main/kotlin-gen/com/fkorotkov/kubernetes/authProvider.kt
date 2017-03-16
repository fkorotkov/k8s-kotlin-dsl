// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig


fun  AuthInfo.`authProvider`(block: AuthProviderConfig.() -> Unit = {}) {
  if(this.`authProvider` == null) {
    this.`authProvider` = AuthProviderConfig()
  }

  this.`authProvider`.block()
}

