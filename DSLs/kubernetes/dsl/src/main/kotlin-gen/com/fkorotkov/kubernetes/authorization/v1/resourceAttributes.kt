// GENERATED
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.authorization.v1.ResourceAttributes as v1_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReviewSpec as v1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewSpec as v1_SubjectAccessReviewSpec


fun  v1_SelfSubjectAccessReviewSpec.`resourceAttributes`(block: v1_ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = v1_ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}


fun  v1_SubjectAccessReviewSpec.`resourceAttributes`(block: v1_ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = v1_ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}

