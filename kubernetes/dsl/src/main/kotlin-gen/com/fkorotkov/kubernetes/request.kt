// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.admission.AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.AdmissionReview


fun  AdmissionReview.`request`(block: AdmissionRequest.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = AdmissionRequest()
  }

  this.`request`.block()
}

