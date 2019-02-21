// GENERATE
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes as authorization_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes as authorization_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus as authorization_SubjectAccessReviewStatus


fun newLocalSubjectAccessReview(block : authorization_LocalSubjectAccessReview.() -> Unit = {}): authorization_LocalSubjectAccessReview {
  val instance = authorization_LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newNonResourceAttributes(block : authorization_NonResourceAttributes.() -> Unit = {}): authorization_NonResourceAttributes {
  val instance = authorization_NonResourceAttributes()
  instance.block()
  return instance
}


fun newResourceAttributes(block : authorization_ResourceAttributes.() -> Unit = {}): authorization_ResourceAttributes {
  val instance = authorization_ResourceAttributes()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : authorization_SubjectAccessReview.() -> Unit = {}): authorization_SubjectAccessReview {
  val instance = authorization_SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewSpec(block : authorization_SubjectAccessReviewSpec.() -> Unit = {}): authorization_SubjectAccessReviewSpec {
  val instance = authorization_SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReviewStatus(block : authorization_SubjectAccessReviewStatus.() -> Unit = {}): authorization_SubjectAccessReviewStatus {
  val instance = authorization_SubjectAccessReviewStatus()
  instance.block()
  return instance
}

