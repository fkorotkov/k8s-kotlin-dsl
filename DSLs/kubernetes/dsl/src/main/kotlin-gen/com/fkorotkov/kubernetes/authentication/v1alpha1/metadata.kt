// GENERATED
package com.fkorotkov.kubernetes.authentication.v1alpha1

import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview as v1alpha1_SelfSubjectReview


fun  v1alpha1_SelfSubjectReview.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}

