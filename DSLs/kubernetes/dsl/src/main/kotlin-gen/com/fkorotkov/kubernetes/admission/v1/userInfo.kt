// GENERATED
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun  v1_AdmissionRequest.`userInfo`(block: authentication_UserInfo.() -> Unit = {}) {
  if(this.`userInfo` == null) {
    this.`userInfo` = authentication_UserInfo()
  }

  this.`userInfo`.block()
}

