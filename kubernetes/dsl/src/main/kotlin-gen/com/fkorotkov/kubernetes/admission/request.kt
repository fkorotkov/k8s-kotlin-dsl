// GENERATED
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.AdmissionReview as admission_AdmissionReview


fun  admission_AdmissionReview.`request`(block: admission_AdmissionRequest.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = admission_AdmissionRequest()
  }

  this.`request`.block()
}

