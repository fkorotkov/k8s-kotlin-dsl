// GENERATED
package com.fkorotkov.kubernetes.admission.v1beta1

import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest as v1beta1_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview as v1beta1_AdmissionReview


fun  v1beta1_AdmissionReview.`request`(block: v1beta1_AdmissionRequest.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = v1beta1_AdmissionRequest()
  }

  this.`request`.block()
}

