// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.admission.AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.AdmissionReview


fun  AdmissionReview.`response`(block: AdmissionResponse.() -> Unit = {}) {
  if(this.`response` == null) {
    this.`response` = AdmissionResponse()
  }

  this.`response`.block()
}

