// GENERATED
package com.fkorotkov.kubernetes.authentication.v1alpha1

import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo
import io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReviewStatus as v1alpha1_SelfSubjectReviewStatus


fun  v1alpha1_SelfSubjectReviewStatus.`userInfo`(block: authentication_UserInfo.() -> Unit = {}) {
  if(this.`userInfo` == null) {
    this.`userInfo` = authentication_UserInfo()
  }

  this.`userInfo`.block()
}

