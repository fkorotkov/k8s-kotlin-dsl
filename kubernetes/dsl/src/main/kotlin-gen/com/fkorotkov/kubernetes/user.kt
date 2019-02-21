// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.NamedAuthInfo as model_NamedAuthInfo


fun  model_NamedAuthInfo.`user`(block: model_AuthInfo.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = model_AuthInfo()
  }

  this.`user`.block()
}

