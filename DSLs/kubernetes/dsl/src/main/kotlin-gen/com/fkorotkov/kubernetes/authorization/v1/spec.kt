// GENERATED
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview as v1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview as v1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReviewSpec as v1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview as v1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReviewSpec as v1_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview as v1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewSpec as v1_SubjectAccessReviewSpec


fun  v1_LocalSubjectAccessReview.`spec`(block: v1_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  v1_SelfSubjectAccessReview.`spec`(block: v1_SelfSubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_SelfSubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  v1_SelfSubjectRulesReview.`spec`(block: v1_SelfSubjectRulesReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_SelfSubjectRulesReviewSpec()
  }

  this.`spec`.block()
}


fun  v1_SubjectAccessReview.`spec`(block: v1_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}

