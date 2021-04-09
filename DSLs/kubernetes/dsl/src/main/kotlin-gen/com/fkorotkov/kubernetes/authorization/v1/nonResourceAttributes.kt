// GENERATED
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.authorization.v1.NonResourceAttributes as v1_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReviewSpec as v1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewSpec as v1_SubjectAccessReviewSpec


fun  v1_SelfSubjectAccessReviewSpec.`nonResourceAttributes`(block: v1_NonResourceAttributes.() -> Unit = {}) {
  if(this.`nonResourceAttributes` == null) {
    this.`nonResourceAttributes` = v1_NonResourceAttributes()
  }

  this.`nonResourceAttributes`.block()
}


fun  v1_SubjectAccessReviewSpec.`nonResourceAttributes`(block: v1_NonResourceAttributes.() -> Unit = {}) {
  if(this.`nonResourceAttributes` == null) {
    this.`nonResourceAttributes` = v1_NonResourceAttributes()
  }

  this.`nonResourceAttributes`.block()
}

