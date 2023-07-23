// GENERATE
package com.fkorotkov.kubernetes.authentication.v1alpha1

import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview as v1alpha1_SelfSubjectReview
import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReviewStatus as v1alpha1_SelfSubjectReviewStatus


fun newSelfSubjectReview(block : v1alpha1_SelfSubjectReview.() -> Unit = {}): v1alpha1_SelfSubjectReview {
  val instance = v1alpha1_SelfSubjectReview()
  instance.block()
  return instance
}


fun newSelfSubjectReviewStatus(block : v1alpha1_SelfSubjectReviewStatus.() -> Unit = {}): v1alpha1_SelfSubjectReviewStatus {
  val instance = v1alpha1_SelfSubjectReviewStatus()
  instance.block()
  return instance
}

