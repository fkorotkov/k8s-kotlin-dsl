// GENERATED
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview as v1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview as v1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview as v1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview as v1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewStatus as v1_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectRulesReviewStatus as v1_SubjectRulesReviewStatus


fun  v1_LocalSubjectAccessReview.`status`(block: v1_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  v1_SelfSubjectAccessReview.`status`(block: v1_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  v1_SelfSubjectRulesReview.`status`(block: v1_SubjectRulesReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_SubjectRulesReviewStatus()
  }

  this.`status`.block()
}


fun  v1_SubjectAccessReview.`status`(block: v1_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}

