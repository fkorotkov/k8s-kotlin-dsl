// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenRequest as authentication_TokenRequest
import io.fabric8.kubernetes.api.model.authentication.TokenRequestSpec as authentication_TokenRequestSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec as authentication_TokenReviewSpec


fun  authentication_TokenRequest.`spec`(block: authentication_TokenRequestSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authentication_TokenRequestSpec()
  }

  this.`spec`.block()
}


fun  authentication_TokenReview.`spec`(block: authentication_TokenReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authentication_TokenReviewSpec()
  }

  this.`spec`.block()
}

