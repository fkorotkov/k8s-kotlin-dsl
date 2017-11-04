// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.NamedAuthInfo
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo


fun  NamedAuthInfo.`user`(block: AuthInfo.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = AuthInfo()
  }

  this.`user`.block()
}


fun  TokenReviewStatus.`user`(block: UserInfo.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = UserInfo()
  }

  this.`user`.block()
}

