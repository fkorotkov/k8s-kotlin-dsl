// GENERATED
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview as v1_AdmissionReview


fun  v1_AdmissionReview.`request`(block: v1_AdmissionRequest.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = v1_AdmissionRequest()
  }

  this.`request`.block()
}

