// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec


fun  SubjectAccessReviewSpec.`resourceAttributes`(block: ResourceAttributes.() -> Unit = {}) {
  if(this.`resourceAttributes` == null) {
    this.`resourceAttributes` = ResourceAttributes()
  }

  this.`resourceAttributes`.block()
}

