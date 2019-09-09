// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun  authentication_TokenReviewStatus.`user`(block: authentication_UserInfo.() -> Unit = {}) {
  if(this.`user` == null) {
    this.`user` = authentication_UserInfo()
  }

  this.`user`.block()
}

