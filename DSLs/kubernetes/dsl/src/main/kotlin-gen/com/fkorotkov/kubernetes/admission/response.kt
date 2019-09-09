// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.admission.AdmissionResponse as admission_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.AdmissionReview as admission_AdmissionReview


fun  admission_AdmissionReview.`response`(block: admission_AdmissionResponse.() -> Unit = {}) {
  if(this.`response` == null) {
    this.`response` = admission_AdmissionResponse()
  }

  this.`response`.block()
}

