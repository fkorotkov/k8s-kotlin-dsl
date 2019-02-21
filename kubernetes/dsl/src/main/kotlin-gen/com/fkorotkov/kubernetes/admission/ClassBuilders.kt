// GENERATE
package com.fkorotkov.kubernetes.admission

import io.fabric8.kubernetes.api.model.admission.AdmissionRequest as admission_AdmissionRequest
import io.fabric8.kubernetes.api.model.admission.AdmissionResponse as admission_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.AdmissionReview as admission_AdmissionReview


fun newAdmissionRequest(block : admission_AdmissionRequest.() -> Unit = {}): admission_AdmissionRequest {
  val instance = admission_AdmissionRequest()
  instance.block()
  return instance
}


fun newAdmissionResponse(block : admission_AdmissionResponse.() -> Unit = {}): admission_AdmissionResponse {
  val instance = admission_AdmissionResponse()
  instance.block()
  return instance
}


fun newAdmissionReview(block : admission_AdmissionReview.() -> Unit = {}): admission_AdmissionReview {
  val instance = admission_AdmissionReview()
  instance.block()
  return instance
}

