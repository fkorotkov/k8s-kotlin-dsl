// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.admission.AdmissionRequest
import io.fabric8.kubernetes.api.model.authentication.UserInfo


fun  AdmissionRequest.`userInfo`(block: UserInfo.() -> Unit = {}) {
  if(this.`userInfo` == null) {
    this.`userInfo` = UserInfo()
  }

  this.`userInfo`.block()
}

