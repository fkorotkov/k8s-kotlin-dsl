// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo


fun  admission_AdmissionRequest.`userInfo`(block: authentication_UserInfo.() -> Unit = {}) {
  if(this.`userInfo` == null) {
    this.`userInfo` = authentication_UserInfo()
  }

  this.`userInfo`.block()
}

