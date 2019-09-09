// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec as authentication_TokenReviewSpec


fun  authentication_TokenReview.`spec`(block: authentication_TokenReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authentication_TokenReviewSpec()
  }

  this.`spec`.block()
}

