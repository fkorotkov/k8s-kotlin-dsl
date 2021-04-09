// GENERATED
package com.fkorotkov.kubernetes.authorization.v1beta1

import io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview as v1beta1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview as v1beta1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReviewSpec as v1beta1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview as v1beta1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReviewSpec as v1beta1_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview as v1beta1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewSpec as v1beta1_SubjectAccessReviewSpec


fun  v1beta1_LocalSubjectAccessReview.`spec`(block: v1beta1_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  v1beta1_SelfSubjectAccessReview.`spec`(block: v1beta1_SelfSubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_SelfSubjectAccessReviewSpec()
  }

  this.`spec`.block()
}


fun  v1beta1_SelfSubjectRulesReview.`spec`(block: v1beta1_SelfSubjectRulesReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_SelfSubjectRulesReviewSpec()
  }

  this.`spec`.block()
}


fun  v1beta1_SubjectAccessReview.`spec`(block: v1beta1_SubjectAccessReviewSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1beta1_SubjectAccessReviewSpec()
  }

  this.`spec`.block()
}

