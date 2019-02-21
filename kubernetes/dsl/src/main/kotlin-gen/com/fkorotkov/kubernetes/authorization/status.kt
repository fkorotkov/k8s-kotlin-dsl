// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus as authorization_SubjectAccessReviewStatus


fun  authorization_LocalSubjectAccessReview.`status`(block: authorization_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}


fun  authorization_SubjectAccessReview.`status`(block: authorization_SubjectAccessReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = authorization_SubjectAccessReviewStatus()
  }

  this.`status`.block()
}

