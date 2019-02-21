// GENERATED
package com.fkorotkov.kubernetes.authentication

import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview


fun  authentication_TokenReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}

