// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes as authorization_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec


fun  authorization_SubjectAccessReviewSpec.`resourceAttributes`(block: authorization_ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = authorization_ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}

