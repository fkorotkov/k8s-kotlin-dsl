// GENERATE
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.BoundObjectReference as authentication_BoundObjectReference
import io.fabric8.kubernetes.api.model.authentication.TokenRequest as authentication_TokenRequest
import io.fabric8.kubernetes.api.model.authentication.TokenRequestSpec as authentication_TokenRequestSpec
import io.fabric8.kubernetes.api.model.authentication.TokenRequestStatus as authentication_TokenRequestStatus
import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec as authentication_TokenReviewSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun newBoundObjectReference(block : authentication_BoundObjectReference.() -> Unit = {}): authentication_BoundObjectReference {
  val instance = authentication_BoundObjectReference()
  instance.block()
  return instance
}


fun newTokenRequest(block : authentication_TokenRequest.() -> Unit = {}): authentication_TokenRequest {
  val instance = authentication_TokenRequest()
  instance.block()
  return instance
}


fun newTokenRequestSpec(block : authentication_TokenRequestSpec.() -> Unit = {}): authentication_TokenRequestSpec {
  val instance = authentication_TokenRequestSpec()
  instance.block()
  return instance
}


fun newTokenRequestStatus(block : authentication_TokenRequestStatus.() -> Unit = {}): authentication_TokenRequestStatus {
  val instance = authentication_TokenRequestStatus()
  instance.block()
  return instance
}


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

