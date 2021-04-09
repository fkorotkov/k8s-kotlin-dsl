// GENERATED
package com.fkorotkov.kubernetes.authorization.v1beta1

import io.fabric8.kubernetes.api.model.authorization.v1beta1.ResourceAttributes as v1beta1_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReviewSpec as v1beta1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewSpec as v1beta1_SubjectAccessReviewSpec


fun  v1beta1_SelfSubjectAccessReviewSpec.`resourceAttributes`(block: v1beta1_ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = v1beta1_ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}


fun  v1beta1_SubjectAccessReviewSpec.`resourceAttributes`(block: v1beta1_ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = v1beta1_ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}

