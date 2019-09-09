// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReview as authorization_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectRulesReview as authorization_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus as authorization_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.SubjectRulesReviewStatus as authorization_SubjectRulesReviewStatus


fun  authorization_LocalSubjectAccessReview.`status`(block: authorization_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  authorization_SelfSubjectAccessReview.`status`(block: authorization_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  authorization_SelfSubjectRulesReview.`status`(block: authorization_SubjectRulesReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectRulesReviewStatus()
  }

  this.`status`.block()
}


fun  authorization_SubjectAccessReview.`status`(block: authorization_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}

