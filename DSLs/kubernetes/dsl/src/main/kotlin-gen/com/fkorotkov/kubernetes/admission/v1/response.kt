// GENERATED
package com.fkorotkov.kubernetes.admission.v1

import io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse as v1_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview as v1_AdmissionReview


fun  v1_AdmissionReview.`response`(block: v1_AdmissionResponse.() -> Unit = {}) {
  if(this.`response` == null) {
    this.`response` = v1_AdmissionResponse()
  }

  this.`response`.block()
}

