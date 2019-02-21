// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec


fun  authorization_LocalSubjectAccessReview.`spec`(block: authorization_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  authorization_SubjectAccessReview.`spec`(block: authorization_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}

