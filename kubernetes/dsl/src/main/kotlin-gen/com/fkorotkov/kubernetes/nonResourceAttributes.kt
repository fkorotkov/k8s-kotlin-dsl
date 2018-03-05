// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec


fun  SubjectAccessReviewSpec.`nonResourceAttributes`(block: NonResourceAttributes.() -> Unit = {}) {
  if(this.`nonResourceAttributes` == null) {
    this.`nonResourceAttributes` = NonResourceAttributes()
  }

  this.`nonResourceAttributes`.block()
}

