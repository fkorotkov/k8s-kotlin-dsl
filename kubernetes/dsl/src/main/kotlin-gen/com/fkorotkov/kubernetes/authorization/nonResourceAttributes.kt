// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes as authorization_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReviewSpec as authorization_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec


fun  authorization_SelfSubjectAccessReviewSpec.`nonResourceAttributes`(block: authorization_NonResourceAttributes.() -> Unit = {}) {
  if(this.`nonResourceAttributes` == null) {
    this.`nonResourceAttributes` = authorization_NonResourceAttributes()
  }

  this.`nonResourceAttributes`.block()
}


fun  authorization_SubjectAccessReviewSpec.`nonResourceAttributes`(block: authorization_NonResourceAttributes.() -> Unit = {}) {
  if(this.`nonResourceAttributes` == null) {
    this.`nonResourceAttributes` = authorization_NonResourceAttributes()
  }

  this.`nonResourceAttributes`.block()
}

