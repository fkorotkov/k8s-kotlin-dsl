// GENERATE
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec as authentication_TokenReviewSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun newTokenReview(block : authentication_TokenReview.() -> Unit = {}): authentication_TokenReview {
  val instance = authentication_TokenReview()
  instance.block()
  return instance
}


fun newTokenReviewSpec(block : authentication_TokenReviewSpec.() -> Unit = {}): authentication_TokenReviewSpec {
  val instance = authentication_TokenReviewSpec()
  instance.block()
  return instance
}


fun newTokenReviewStatus(block : authentication_TokenReviewStatus.() -> Unit = {}): authentication_TokenReviewStatus {
  val instance = authentication_TokenReviewStatus()
  instance.block()
  return instance
}


fun newUserInfo(block : authentication_UserInfo.() -> Unit = {}): authentication_UserInfo {
  val instance = authentication_UserInfo()
  instance.block()
  return instance
}

