// GENERATED
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview


fun  authorization_LocalSubjectAccessReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  authorization_SubjectAccessReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}

