// GENERATED
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview as v1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview as v1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview as v1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview as v1_SubjectAccessReview


fun  v1_LocalSubjectAccessReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_SelfSubjectAccessReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_SelfSubjectRulesReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_SubjectAccessReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}

