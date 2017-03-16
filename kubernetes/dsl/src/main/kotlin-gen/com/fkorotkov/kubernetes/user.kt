// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.NamedAuthInfo


fun  NamedAuthInfo.`user`(block: AuthInfo.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = AuthInfo()
  }

  this.`user`.block()
}

