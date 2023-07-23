// GENERATED
package com.fkorotkov.kubernetes.authentication.v1alpha1

import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview as v1alpha1_SelfSubjectReview
import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReviewStatus as v1alpha1_SelfSubjectReviewStatus


fun  v1alpha1_SelfSubjectReview.`status`(block: v1alpha1_SelfSubjectReviewStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1alpha1_SelfSubjectReviewStatus()
  }

  this.`status`.block()
}

