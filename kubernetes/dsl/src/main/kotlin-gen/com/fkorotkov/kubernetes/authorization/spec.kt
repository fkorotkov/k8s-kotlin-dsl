// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReview as authorization_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReviewSpec as authorization_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectRulesReview as authorization_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectRulesReviewSpec as authorization_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec


fun  authorization_LocalSubjectAccessReview.`spec`(block: authorization_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  authorization_SelfSubjectAccessReview.`spec`(block: authorization_SelfSubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SelfSubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  authorization_SelfSubjectRulesReview.`spec`(block: authorization_SelfSubjectRulesReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SelfSubjectRulesReviewSpec()
  }

  this.`spec`.block()
}


fun  authorization_SubjectAccessReview.`spec`(block: authorization_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = authorization_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}

